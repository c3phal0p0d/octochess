package c3phal0p0d.project.octochess.entity.pieces;

import c3phal0p0d.project.octochess.entity.game.*;

import java.util.ArrayList;

public class Bishop extends Piece {

    public Bishop(Colour colour) {
        super(colour, PieceType.BISHOP);
    }

    @Override
    public boolean isValidMove(Board board, Move move) {
        // can only move diagonally
        return Math.abs(move.getEndSquare().getY() - move.getStartSquare().getY()) == Math.abs(move.getEndSquare().getX() - move.getStartSquare().getX());
    }

    @Override
    public ArrayList<Square> getMovePath(Board board, Move move) {
        ArrayList<Square> path = new ArrayList<>();

        int rowDiff = move.getEndSquare().getY() - move.getStartSquare().getY();
        int columnDiff = move.getEndSquare().getX() - move.getStartSquare().getX();
        int numSquares = Math.abs(rowDiff);

        // get all squares in a diagonal path to the finishing square
        for (int i=0; i<numSquares; i++){
            path.add(board.getSquare(move.getStartSquare().getX() + i*columnDiff/numSquares, move.getStartSquare().getY() + i*rowDiff/numSquares));
        }

        return path;
    }


}
