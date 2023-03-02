package c3phal0p0d.project.octochess.chess.pieces;

import c3phal0p0d.project.octochess.chess.game.*;

public class Bishop extends Piece {

    public Bishop(Colour colour) {
        super(colour);
    }

    @Override
    public boolean isValidMove(Board board, Move move) {
        return false;
    }

    @Override
    public Square[] getMovePath(Board board, Move move) {
        return new Square[0];
    }
}
