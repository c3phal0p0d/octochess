package c3phal0p0d.project.octochess.entity.pieces;

import c3phal0p0d.project.octochess.entity.game.*;

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
        // check for validity of diagonal moves
        else if (Math.abs(endX-startX) == Math.abs(endY-startY)){
            if (move.getEndSquare().getPiece()==null)   // can only move diagonally if there is a piece to capture
                return false;
            else if (endY-startY>1){    // can only move one square diagonally
                 return false;
            }
            return true;
        }
        // cannot capture a piece vertically
        else if (startX==endX&&startY!=endY&&move.getEndSquare().getPiece()!=null){
            return false;
        }
        // can only move two squares forward if it is still at its start game position
        else if (endY-startY==2){
            if (startY==1&&getColour()==Colour.WHITE || startY==6 && getColour()==Colour.BLACK){
                return true;
            }
            return false;
        }
        // can only move 1 square forward otherwise
        else if (endY-startY>1){
            return false;
        }

        // TODO: En passant

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
