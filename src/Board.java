public class Board {
    /**
     * This is the entire 9x9 sudoku board.
     */

    private boolean complete; // move this to Play class (probably)

    public Board() {
        complete = false;
        /*
        Put file-reading stuff here
         */

        // todo for loop and nested for loop (col, row) to put numbers in correct block

    }

    /**
     * If the game is complete, the player won
     * @return Is the game complete?
     */
    public boolean getPlayerWin() {
        // todo move getPlayerWin() to Play
        // may remove entirely
        return complete;
    }

    /**
     * Flips the complete field above
     */
    public void setPlayerWin() {
        // todo move setPlayerWin() to Play
        // may remove entirely
        complete = true;
    }

    /**
     * Test if the specified row has duplicate numbers
     * @param row The row to check
     * @param num The number that must not already exist in row
     * @return Whether there is a duplicate of the number provided
     */
    public boolean checkRow (int row, int num) {
        // todo finish checkRow
        return false;
    }

    /**
     * Test if the specified column has duplicate numbers
     * @param col The column to check
     * @param num The number that must not already exist in column
     * @return Whether there is a duplicate of the number provided
     */
    public boolean checkColumn (int col, int num) {
        // todo finish checkColumn
        /*
        Place pseudocode here
         */
        return false;
    }

    @Override
    public String toString() {
        // todo finish override toString method in Board
        return "";
    }
}
