package c3phal0p0d.project.octochess.chess.pieces;

import c3phal0p0d.project.octochess.chess.game.*;

import java.util.ArrayList;

public class Queen extends Piece {

    public Queen(Colour colour) {
        super(colour);
    }

    @Override
    public boolean isValidMove(Board board, Move move) {
        // can move diagonally, horizontally or vertically
        return (Math.abs(move.getEndSquare().getY() - move.getStartSquare().getY()) == Math.abs(move.getEndSquare().getX() - move.getStartSquare().getX()))
                || ((move.getStartSquare().getY() == move.getEndSquare().getY()) && (move.getStartSquare().getX() != move.getEndSquare().getX()))
                || ((move.getStartSquare().getY() != move.getEndSquare().getY()) && (move.getStartSquare().getX() == move.getEndSquare().getX()));
    }

    @Override
    public ArrayList<Square> getMovePath(Board board, Move move) {
        ArrayList<Square> path = new ArrayList<>();

        int rowDiff = move.getEndSquare().getY() - move.getStartSquare().getY();
        int columnDiff = move.getEndSquare().getX() - move.getStartSquare().getX();

        if (rowDiff==columnDiff){   // moving diagonally
            int numSquares = Math.abs(rowDiff);
            for (int i=0; i<numSquares; i++){
                path.add(board.getSquare(move.getStartSquare().getX() + i*columnDiff/numSquares, move.getStartSquare().getY() + i*rowDiff/numSquares));
            }
        }
        else if (rowDiff!=0){   // moving vertically
            int numSquares = Math.abs(rowDiff);
            for (int i=0; i<numSquares; i++){
                path.add(board.getSquare(move.getStartSquare().getX(), move.getStartSquare().getY()+i*numSquares/rowDiff));
            }
        }
        else {    // moving horizontally
            int numSquares = Math.abs(columnDiff);
            for (int i=0; i<numSquares; i++){
                path.add(board.getSquare(move.getStartSquare().getX()+i*numSquares/columnDiff, move.getStartSquare().getY()));
            }
        }

        return path;
    }
}
