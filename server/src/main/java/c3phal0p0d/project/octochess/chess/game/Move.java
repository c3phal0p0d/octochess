package c3phal0p0d.project.octochess.chess.game;

import c3phal0p0d.project.octochess.chess.pieces.Piece;

public class Move {
    private final Player player;
    private final Square startSquare;
    private final Square endSquare;
    private final Piece piece;

    public Move(Player player, Square startSquare, Square endSquare) {
        this.player = player;
        this.startSquare = startSquare;
        this.endSquare = endSquare;
        this.piece = startSquare.getPiece();
    }

    public Player getPlayer() {
        return player;
    }

    public Square getStartSquare() {
        return startSquare;
    }

    public Square getEndSquare() {
        return endSquare;
    }

    public Piece getPiece() {
        return piece;
    }
}
