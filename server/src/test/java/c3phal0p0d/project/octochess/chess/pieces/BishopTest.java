package c3phal0p0d.project.octochess.chess.pieces;

import c3phal0p0d.project.octochess.chess.game.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BishopTest {
    private final Player player = new Player(Colour.WHITE);
    private final Board board = new Board();
    Bishop bishop = new Bishop(Colour.WHITE);

    /* Valid moves */
    @Test
    public void valid_MoveDiagonally_ForwardRight(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(6,6));
        Assertions.assertTrue(bishop.isValidMove(board, move));
    }

    @Test
    public void valid_MoveDiagonally_ForwardLeft(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(0,6));
        Assertions.assertTrue(bishop.isValidMove(board, move));
    }

    @Test
    public void valid_MoveDiagonally_BackwardRight(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(6,0));
        Assertions.assertTrue(bishop.isValidMove(board, move));
    }

    @Test
    public void valid_MoveDiagonally_BackwardLeft(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(0,0));
        Assertions.assertTrue(bishop.isValidMove(board, move));
    }


    /* Invalid moves */
    @Test
    public void invalid_MoveHorizontally(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(6,3));
        Assertions.assertFalse(bishop.isValidMove(board, move));
    }

    @Test
    public void invalid_MoveVertically(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(3,6));
        Assertions.assertFalse(bishop.isValidMove(board, move));
    }

    @Test
    public void invalid_MoveToRandomPosition(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(1, 7));
        Assertions.assertFalse(bishop.isValidMove(board, move));
    }
}
