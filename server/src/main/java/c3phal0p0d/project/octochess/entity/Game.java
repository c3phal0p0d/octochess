package c3phal0p0d.project.octochess.entity;

import c3phal0p0d.project.octochess.entity.game.*;
import c3phal0p0d.project.octochess.entity.pieces.*;
//import jakarta.persistence.*;

import java.util.ArrayList;

public class Game {
//    @Id
//    private int id;

    //@OneToOne
    //@Column(name="board")
    private final Board board;

    private final Player[] players;

    private int currentPlayerTurn;
    private Status status;

    public Game(){
        board = new Board();
        players = new Player[]{new Player(Colour.WHITE), new Player(Colour.BLACK)};
        setCurrentPlayerTurn(0);
        setStatus(Status.WAITING_FOR_PLAYER);

        initializePieces(getPlayers()[0]);
        initializePieces(getPlayers()[1]);
    }

    /**
     * Assign pieces to player and place the pieces at their starting positions on the board
     */
    public void initializePieces(Player player){
        Colour colour = player.getColour();
        int row1;
        int row2;

        if (colour==Colour.WHITE){
            row1 = 0;
            row2 = 1;
        } else {
            row1=7;
            row2=6;
        }

        // King
        Piece piece = new King(colour);
        player.addPiece(piece);
        getBoard().getSquare(4, row1).setPiece(piece);

        // Queen
        piece = new Queen(colour);
        player.addPiece(piece);
        getBoard().getSquare(3, row1).setPiece(piece);

        // Rooks
        piece = new Rook(colour);
        player.addPiece(piece);
        getBoard().getSquare(0, row1).setPiece(piece);
        piece = new Rook(colour);
        player.addPiece(piece);
        getBoard().getSquare(7, row1).setPiece(piece);

        // Knights
        piece = new Knight(colour);
        player.addPiece(piece);
        getBoard().getSquare(1, row1).setPiece(piece);
        piece = new Knight(colour);
        player.addPiece(piece);
        getBoard().getSquare(6, row1).setPiece(piece);

        // Bishops
        piece = new Bishop(colour);
        player.addPiece(piece);
        getBoard().getSquare(2, row1).setPiece(piece);
        piece = new Bishop(colour);
        player.addPiece(piece);
        getBoard().getSquare(5, row1).setPiece(piece);

        // Pawns
        for (int i=0; i<8; i++){
            piece = new Pawn(colour);
            player.addPiece(piece);
            getBoard().getSquare(i, row2).setPiece(piece);
        }
    }

    /* Gameplay logic */
    /**
     * Move a piece to another square
     * @param player player making the move
     * @param startSquare current position of piece to be moved
     * @param endSquare intended destination of piece to be moved
     * @return true if player makes valid move, false if move is not valid
     */
    public boolean playerMove(Player player, Square startSquare, Square endSquare){
        Move move = new Move(player, startSquare, endSquare);

        // make sure piece actually moves somewhere
        if (move.getStartSquare().equals(move.getEndSquare())){
            return false;
        }

        // check whether move is valid according to the rules for that piece
        if (!move.getPiece().isValidMove(board, move)){
            return false;
        }

        // check that piece's path is not blocked by any other piece, unless moving piece is a knight
        Piece movePiece = move.getStartSquare().getPiece();
        if (!(movePiece instanceof Knight)){
            ArrayList<Square> movePath = movePiece.getMovePath(board, move);
            for (Square square : movePath){
                // make sure that all squares in the path except the first and final ones are empty
                if (!(square.equals(move.getStartSquare()) || square.equals(move.getEndSquare())) && square.getPiece()!=null){
                    return false;
                }
            }
        }

        // check if final square contains a piece
        Piece piece = move.getEndSquare().getPiece();
        if (piece!=null){
            // check if piece belongs to the player
            if (piece.getColour()==player.getColour()){
                return false;
            }
            Player opponent = getCurrentPlayerTurn()==0 ? getPlayers()[1] : getPlayers()[0];

            // remove piece from opponent's pieces array and add to their captured pieces array
            opponent.removePiece(piece);
            opponent.addCapturedPiece(piece);
        }
        endSquare.setPiece(move.getPiece());

        return true;
    }

    /**
     * Switch the current player turn
     */
    public void switchCurrentPlayerTurn(){
        setCurrentPlayerTurn(getCurrentPlayerTurn()==0 ? 1 : 0);
    }


    /**
     * Determine if a king is in check
     * @return
     */
    public boolean isCheck(){
        return false;
    }

    /**
     * Determine if a king is in checkmate
     * @return
     */
    public boolean isCheckmate(){
        return false;
    }

    /**
     * Determine if there is a stalemate
     * @return
     */
    public boolean isStalemate(){
        return false;
    }


    /* Getters and setters */
    public Board getBoard() {
        return board;
    }

    public Player[] getPlayers() {
        return players;
    }

    public int getCurrentPlayerTurn() {
        return currentPlayerTurn;
    }

    public void setCurrentPlayerTurn(int currentPlayerTurn) {
        this.currentPlayerTurn = currentPlayerTurn;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
