package c3phal0p0d.project.octochess.chess.pieces;

import c3phal0p0d.project.octochess.chess.game.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KingTest {
    private final Player player = new Player(Colour.WHITE);
    private final Board board = new Board();
    King king = new King(Colour.WHITE);

    /* Valid moves */
    @Test
    public void valid_MoveOneSquare_Vertically(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(3,4));
        Assertions.assertTrue(king.isValidMove(board, move));
    }

    @Test
    public void valid_MoveOneSquare_Horizontally(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(4,3));
        Assertions.assertTrue(king.isValidMove(board, move));
    }

    @Test
    public void valid_MoveOneSquare_Diagonally(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(4,4));
        Assertions.assertTrue(king.isValidMove(board, move));
    }

    /* Invalid moves */
    @Test
    public void invalid_MoveMoreThanOneSquare(){
        Move move = new Move(player, board.getSquare(3, 3), board.getSquare(3,5));
        Assertions.assertFalse(king.isValidMove(board, move));
    }
}
