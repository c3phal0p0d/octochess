package c3phal0p0d.project.octochess.entity.pieces;

import c3phal0p0d.project.octochess.entity.game.*;

import java.util.ArrayList;

public class King extends Piece {

    public King(Colour colour) {
        super(colour, PieceType.KING);
    }

    @Override
    public boolean isValidMove(Board board, Move move) {
        // can only move one square
        return Math.abs(move.getEndSquare().getX() - move.getStartSquare().getX()) <= 1
                && Math.abs(move.getEndSquare().getY() - move.getStartSquare().getY()) <= 1;
    }

    @Override
    public ArrayList<Square> getMovePath(Board board, Move move) {
        ArrayList<Square> path = new ArrayList<>();
        path.add(move.getStartSquare());
        path.add(move.getEndSquare());

        return path;
    }
}
