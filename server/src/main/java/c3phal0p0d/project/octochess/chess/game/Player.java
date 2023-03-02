package c3phal0p0d.project.octochess.chess.game;

import c3phal0p0d.project.octochess.chess.pieces.*;

import java.util.ArrayList;

public class Player {
    private final Colour colour;
    private final ArrayList<Piece> pieces;
    private final ArrayList<Piece> capturedPieces;

    public Player(Colour colour){
        this.colour = colour;
        pieces = new ArrayList<>();
        capturedPieces = new ArrayList<>();
    }

    public Colour getColour(){
        return colour;
    }

    public ArrayList<Piece> getPieces(){
        return pieces;
    }

    public void addPiece(Piece piece){
        getPieces().add(piece);
    }

    public void removePiece(Piece piece){
        getPieces().remove(piece);
    }

    public ArrayList<Piece> getCapturedPieces() {
        return capturedPieces;
    }

    public void addCapturedPiece(Piece piece){
        getCapturedPieces().add(piece);
    }
}
