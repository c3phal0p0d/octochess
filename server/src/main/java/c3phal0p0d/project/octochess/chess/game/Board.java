package c3phal0p0d.project.octochess.chess.game;

public class Board {
    private static final int NUM_ROWS = 8;
    private static final int NUM_COLUMNS = 8;

    private final Square[][] squares;

    public Board(){
        // initialize array of board squares with their colours
        squares = new Square[NUM_ROWS][NUM_COLUMNS];
        for (int x=0; x<NUM_COLUMNS; x++){
            for (int y=0; y<NUM_ROWS; y++){
                squares[x][y] = new Square(x, y, (x + y) % 2 != 0 ? Colour.WHITE : Colour.BLACK);
            }
        }
    }

    public Square[][] getSquares() {
        return squares;
    }

    /**
     * Get square with specified coordinates on the board
     * @param x x-coordinate
     * @param y y-coordinate
     * @return square
     */
    public Square getSquare(int x, int y){
        return squares[x][y];
    }

}
