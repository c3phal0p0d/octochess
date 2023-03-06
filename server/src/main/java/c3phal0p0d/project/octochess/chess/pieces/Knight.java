package c3phal0p0d.project.octochess.chess.pieces;

import c3phal0p0d.project.octochess.chess.game.*;

import java.util.ArrayList;

public class Knight extends Piece {

    public Knight(Colour colour) {
        super(colour);
    }

    @Override
    public boolean isValidMove(Board board, Move move) {
        // can only move in an L-shape
        return (Math.abs(move.getEndSquare().getY() - move.getStartSquare().getY())==1 && Math.abs(move.getEndSquare().getX() - move.getStartSquare().getX()) == 2)
                || (Math.abs(move.getEndSquare().getY() - move.getStartSquare().getY()) == 2 && Math.abs(move.getEndSquare().getX() - move.getStartSquare().getX()) == 1);
    }

    @Override
    public ArrayList<Square> getMovePath(Board board, Move move) {
        ArrayList<Square> path = new ArrayList<>();

        int startX = move.getStartSquare().getX();
        int startY = move.getStartSquare().getY();
        int endX = move.getEndSquare().getX();
        int endY = move.getEndSquare().getY();
        int rowDiff = endY - startY;
        int columnDiff = endX - startX;

        path.add(move.getStartSquare());
        if (Math.abs(rowDiff)==1){
            path.add(board.getSquare(startX, startY+rowDiff));
            path.add(board.getSquare(startX+columnDiff/2,startY+rowDiff));
            path.add(board.getSquare(startX+columnDiff,startY+rowDiff));
        } else {
            path.add(board.getSquare(startX+columnDiff, startY));
            path.add(board.getSquare(startX+columnDiff,startY+rowDiff/2));
            path.add(board.getSquare(startX+columnDiff,startY+rowDiff));
        }
        path.add(move.getEndSquare());

        return path;
    }
}
