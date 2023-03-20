package c3phal0p0d.project.octochess.entity.pieces;

import c3phal0p0d.project.octochess.entity.game.*;

import java.util.ArrayList;

public abstract class Piece {
    private Colour colour;
    private PieceType type;

    public Piece(Colour colour, PieceType type) {
        this.colour = colour;
        this.type = type;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public PieceType getType() {
        return type;
    }

    public void setType(PieceType type) {
        this.type = type;
    }

    /**
     * Checks if a particular move is valid
     * @return true is move is valid, false if move is invalid
     */
    public abstract boolean isValidMove(Board board, Move move);

    /**
     * Get an array of the squares that the piece must pass through while making the move,
     * starting with its initial position and ending with its final position
     * @return array of squares
     */
    public abstract ArrayList<Square> getMovePath(Board board, Move move);
}
