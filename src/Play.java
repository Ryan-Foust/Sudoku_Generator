import java.util.Scanner;
public class Play {
    /*
     * Need to work out a consistent coordinate system to be able to work with the user properly.
     * ([Section], [Block], [Number to Put]) may work, but will need to trial a bunch of times to see how well this
     * works. May get confusing because [Section] and [Block] would be labelled 0-8,
     * while [Number to Put] would be 1-9
     */

    // This will be the main file to start on.

    public static Board board;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Read from file or generate a new one?
        int control = 0;    // will just read from a file for now
        // for consistent results in setting up the board properly

        // Replace with Board object??
        build(control);

        printRules();

        showBoard();
    }

    public static void printRules () {
        System.out.println("The rules of Sudoku are simple.");
        System.out.println("The numbers 1-9 can only appear once per row, " +
                "once per column, and once per section.");
    }

    public static void build (int control) {
        // read from file
        if (control == 0) {
            board = Setup.fileRead();
        }


        // generate a new one
        else {
            Setup.generateNew();
        }
    }
    public static void showBoard () {
        System.out.println(board.toString());
    }
}
