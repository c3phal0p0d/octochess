package c3phal0p0d.project.octochess.entity.pieces;

import c3phal0p0d.project.octochess.entity.game.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueenTest {
    private final Player player = new Player(Colour.WHITE);
    private final Board board = new Board();
    Queen queen = new Queen(Colour.WHITE);

    /* Valid moves */
    @Test
    public void valid_MoveDiagonally_ForwardRight(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(6,6));
        Assertions.assertTrue(queen.isValidMove(board, move));
    }

    @Test
    public void valid_MoveDiagonally_ForwardLeft(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(0,6));
        Assertions.assertTrue(queen.isValidMove(board, move));
    }

    @Test
    public void valid_MoveDiagonally_BackwardRight(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(6,0));
        Assertions.assertTrue(queen.isValidMove(board, move));
    }

    @Test
    public void valid_MoveDiagonally_BackwardLeft(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(0,0));
        Assertions.assertTrue(queen.isValidMove(board, move));
    }

    @Test
    public void valid_MoveHorizontally_Right(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(4,3));
        Assertions.assertTrue(queen.isValidMove(board, move));
    }

    @Test
    public void valid_MoveHorizontally_Left(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(2,3));
        Assertions.assertTrue(queen.isValidMove(board, move));
    }

    @Test
    public void valid_MoveVertically_Forward(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(3,4));
        Assertions.assertTrue(queen.isValidMove(board, move));
    }

    @Test
    public void valid_MoveVertically_Backward(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(3,2));
        Assertions.assertTrue(queen.isValidMove(board, move));
    }
    
    
    /* Invalid moves */
    @Test
    public void invalid_MoveToRandomPosition(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(1, 7));
        Assertions.assertFalse(queen.isValidMove(board, move));
    }

}
