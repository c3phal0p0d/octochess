package c3phal0p0d.project.octochess.entity.pieces;

import c3phal0p0d.project.octochess.entity.game.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KnightTest {
    private final Player player = new Player(Colour.WHITE);
    private final Board board = new Board();
    Knight knight = new Knight(Colour.WHITE);

    /* Valid moves */
    @Test
    public void valid_MoveForwardRight_1(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(4,5));
        Assertions.assertTrue(knight.isValidMove(board, move));
    }

    @Test
    public void valid_MoveForwardRight_2(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(5,4));
        Assertions.assertTrue(knight.isValidMove(board, move));
    }

    @Test
    public void valid_MoveForwardLeft_1(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(2,5));
        Assertions.assertTrue(knight.isValidMove(board, move));
    }

    @Test
    public void valid_MoveForwardLeft_2(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(1,4));
        Assertions.assertTrue(knight.isValidMove(board, move));
    }

    @Test
    public void valid_MoveBackwardRight_1(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(4,1));
        Assertions.assertTrue(knight.isValidMove(board, move));
    }

    @Test
    public void valid_MoveBackwardRight_2(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(5,2));
        Assertions.assertTrue(knight.isValidMove(board, move));
    }

    @Test
    public void valid_MoveBackwardLeft_1(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(2,1));
        Assertions.assertTrue(knight.isValidMove(board, move));
    }

    @Test
    public void valid_MoveBackwardLeft_2(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(1,2));
        Assertions.assertTrue(knight.isValidMove(board, move));
    }


    /* Invalid moves */
    @Test
    public void valid_MoveToRandomPosition(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(5,7));
        Assertions.assertFalse(knight.isValidMove(board, move));
    }
}
