package c3phal0p0d.project.octochess.entity.pieces;

import c3phal0p0d.project.octochess.entity.game.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PawnTest {
    private final Player player = new Player(Colour.WHITE);
    private final Board board = new Board();
    Pawn pawn = new Pawn(Colour.WHITE);

    /* Valid moves */
    @Test
    public void valid_MoveOneSquare_FromStartPosition(){
        Move move = new Move(player, board.getSquare(0, 1), board.getSquare(0,2));
        Assertions.assertTrue(pawn.isValidMove(board, move));
    }

    @Test
    public void valid_MoveTwoSquares_FromStartPosition(){
        Move move = new Move(player, board.getSquare(0, 1), board.getSquare(0,3));
        Assertions.assertTrue(pawn.isValidMove(board, move));
    }

    @Test
    public void valid_MoveOneSquare(){
        Move move = new Move(player, board.getSquare(0, 2), board.getSquare(0,3));
        Assertions.assertTrue(pawn.isValidMove(board, move));
    }


    /* Invalid moves */
    @Test
    public void invalid_MoveMoreThanTwoSquares_FromStartPosition(){
        Move move = new Move(player, board.getSquare(0, 1), board.getSquare(0,4));
        Assertions.assertFalse(pawn.isValidMove(board, move));
    }

    @Test
    public void invalid_MoveMoreThanOneSquare(){
        Move move = new Move(player, board.getSquare(0, 2), board.getSquare(0,4));
        Assertions.assertFalse(pawn.isValidMove(board, move));
    }

    @Test
    public void invalid_MoveDiagonally_NoPieceToCapture(){
        Move move = new Move(player, board.getSquare(0, 1), board.getSquare(1,2));
        Assertions.assertFalse(pawn.isValidMove(board, move));
    }

    @Test
    public void invalid_MoveBackwards(){
        Move move = new Move(player, board.getSquare(0, 1), board.getSquare(0,0));
        Assertions.assertFalse(pawn.isValidMove(board, move));
    }

    @Test
    public void invalid_MoveToRandomPosition(){
        Move move = new Move(player, board.getSquare(0, 1), board.getSquare(5,6));
        Assertions.assertFalse(pawn.isValidMove(board, move));
    }
}
