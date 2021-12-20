import java.io.*;
public class Setup {
    /**
     * This will set up a game of sudoku.
     * For reading from a file, will assume that the board is set up by section.
     * A blank block is represented by an 'x'.
     */

    public static Board fileRead() {
        // make file to reference
        File board_0001 = new File("test_board_0001");

        // make board object to fill
        Board board = new Board();

        // todo fill board (stubbed)

        return board;
    }

    public static void generateNew() {
        // if finish this part, make new class to handle this
    }
}
