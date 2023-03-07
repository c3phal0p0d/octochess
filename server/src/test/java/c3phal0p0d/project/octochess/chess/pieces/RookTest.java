package c3phal0p0d.project.octochess.chess.pieces;

import c3phal0p0d.project.octochess.chess.game.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RookTest {
    private final Player player = new Player(Colour.WHITE);
    private final Board board = new Board();
    Rook rook = new Rook(Colour.WHITE);

    /* Valid moves */
    @Test
    public void valid_MoveHorizontally_Right(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(4,3));
        Assertions.assertTrue(rook.isValidMove(board, move));
    }

    @Test
    public void valid_MoveHorizontally_Left(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(2,3));
        Assertions.assertTrue(rook.isValidMove(board, move));
    }

    @Test
    public void valid_MoveVertically_Forward(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(3,4));
        Assertions.assertTrue(rook.isValidMove(board, move));
    }

    @Test
    public void valid_MoveVertically_Backward(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(3,2));
        Assertions.assertTrue(rook.isValidMove(board, move));
    }


    /* Invalid moves */
    @Test
    public void valid_MoveDiagonally(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(4,4));
        Assertions.assertFalse(rook.isValidMove(board, move));
    }

    @Test
    public void valid_MoveToRandomPosition(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(2,6));
        Assertions.assertFalse(rook.isValidMove(board, move));
    }
}
