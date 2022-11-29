public class Board {
    /**
     * This is the entire sudoku board, made up of 9 sections of 9 blocks for each section.
     */

    private boolean complete; // move this to Play class (probably)

    public Board() {
        complete = false;
        /*
        Put file-reading stuff here
         */
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

    @Override
    public String toString() {
        return "";
    }
}
