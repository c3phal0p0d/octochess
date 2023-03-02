package c3phal0p0d.project.octochess.chess.pieces;

import c3phal0p0d.project.octochess.chess.game.*;

public abstract class Piece {
    private final Colour colour;

    public Piece(Colour colour) {
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

    /**
     * Checks if a particular move is valid
     * @return true is move is valid, false if move is invalid
     */
    public abstract boolean isValidMove(Board board, Move move);

    /**
     * Get an array of the squares that the piece must pass through while making the move,
     * starting with its initial position and ending with its final position
     * @return array of coordinates
     */
    public abstract Square[] getMovePath(Board board, Move move);
}
