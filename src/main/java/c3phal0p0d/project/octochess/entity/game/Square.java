package c3phal0p0d.project.octochess.entity.game;

import c3phal0p0d.project.octochess.entity.pieces.Piece;

public class Square {
    private final int x;
    private final int y;
    private final Colour colour;
    private Piece piece;

    public Square(int x, int y, Colour colour) {
        this.x = x;
        this.y = y;
        this.colour = colour;
        this.piece = null;
    }

    public Colour getColour() {
        return colour;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
