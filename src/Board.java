public class Board {
    /**
     * This is the entire sudoku board, made up of 9 sections of 9 blocks for each section.
     */

    private boolean complete;

    public Board() {
        // duh, game just started
        complete = false;

        /**
         * Use Section sect# = new Section(); and the like here
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
