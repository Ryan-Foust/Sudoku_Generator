public class Board {
    /**
     * This is the entire sudoku board, made up of 9 sections of 9 blocks for each section.
     */

    private boolean complete;

    public Board() {
        // duh, game just started
        complete = false;

        // todo for loop and nested for loop (col, row) to put numbers in correct block

    }

    /**
     * If the game is complete, the player won
     * @return Is the game complete?
     */
    public boolean getPlayerWin() {
        return complete;
    }

    /**
     * Flips the complete field above
     */
    public void setPlayerWin() {
        complete = true;
    }

    /**
     * checks specified row for duplicate numbers
     * @return whether the check passes (no duplicate numbers in the row)
     */
    public boolean checkRow (int row) {
        // todo finish checkRow
        return false;
    }

    /**
     * checks specified column for duplicate numbers
     * @return whether the check passes (no duplicate numbers in the column)
     */
    public boolean checkColumn (int col) {
        // todo finish checkColumn
        return false;
    }

    @Override
    public String toString() {
        // todo finish override toString method in Board
        return "";
    }
}
