package c3phal0p0d.project.octochess.chess.pieces;

import c3phal0p0d.project.octochess.chess.game.*;

import java.util.ArrayList;

public class Pawn extends Piece {

    public Pawn(Colour colour) {
        super(colour);
    }

    @Override
    public boolean isValidMove(Board board, Move move) {
        int startX = move.getStartSquare().getX();
        int startY = move.getStartSquare().getY();
        int endX = move.getEndSquare().getX();
        int endY = move.getEndSquare().getY();

        // cannot move backwards
        if (endY<startY){
            return false;
        }

        // can only move diagonally to capture a piece, and only one square
        if (startX!=endX && move.getEndSquare().getPiece()==null && endY-startY>1){
            return false;
        }

        // cannot capture a piece vertically
        if (startX==endX && move.getEndSquare().getPiece()!=null){
            return false;
        }

        // can only move two squares forward if it is still at its start game position
        if (endY-startY==2&&!(startY==1&&move.getStartSquare().getPiece().getColour()==Colour.WHITE
                || startY==6 && move.getStartSquare().getPiece().getColour()==Colour.BLACK)){
                return false;
        }

        // can only move 1 square forward otherwise
        if (endY-startY>1){
            return false;
        }

        // En passant?

        return true;

    }

    @Override
    public ArrayList<Square> getMovePath(Board board, Move move) {
        ArrayList<Square> path = new ArrayList<>();
        path.add(move.getStartSquare());

        // case where move is two squares forward rather than just one
        if (move.getEndSquare().getY()-move.getStartSquare().getY()==2){
            path.add(board.getSquare(move.getStartSquare().getX(), move.getStartSquare().getY()+1));
        }

        path.add(move.getEndSquare());

        return path;
    }
}
