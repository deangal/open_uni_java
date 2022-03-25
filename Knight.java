import java.util.Scanner;

public class Knight {
    public static void main(String[] args) {

        // SCAN
        Scanner scan = new Scanner(System.in);
        System.out.println("This program reads two integers which " +
                "represent the knight's location on the chess board: ");
        System.out.println("Please enter the number of row");
        int row = scan.nextInt();

        // I MADE 2 CHECKS SO IF ONE OF THEM FAILS IT WILL EXIT THE SCRIPT
        // ROW SCAN CHECK
        if (row > 8 || row < 1) {
            System.out.println("Illigel Input");
        } else {

            System.out.println("Please enter the number of column");
            int col = scan.nextInt();

            // COL SCAN CHECK
            if (col > 8 || col < 1) {
                System.out.println("Illigel Input");
            } else {

                // VARIBLES FOR GENARTING MOVES OPTIONS | P => PLUS, M => MINUS
                int row_p1 = row + 1;
                int row_m1 = row - 1;
                int row_p2 = row + 2;
                int row_m2 = row - 2;

                int col_p1 = col + 1;
                int col_m1 = col - 1;
                int col_p2 = col + 2;
                int col_m2 = col - 2;

                // row+1 , col+-2
                System.out.println("Moves: ");
                if ((row_p1 > 0 && row_p1 < 9) && (col_p2 > 0 && col_p2 < 9)) {
                    System.out.format("%d %d\n", row_p1, col_p2);
                }
                if ((row_p1 > 0 && row_p1 < 9) && (col_m2 > 0 && col_m2 < 9)) {
                    System.out.format("%d %d\n", row_p1, col_m2);
                }

                // row-1 , col+-2
                if ((row_m1 > 0 && row_m1 < 9) && (col_p2 > 0 && col_p2 < 9)) {
                    System.out.format("%d %d\n", row_m1, col_p2);
                }
                if ((row_m1 > 0 && row_m1 < 9) && (col_m2 > 0 && col_m2 < 9)) {
                    System.out.format("%d %d\n", row_m1, col_m2);
                }

                // row+2 , col+-1
                if ((row_p2 > 0 && row_p2 < 9) && (col_p1 > 0 && col_p1 < 9)) {
                    System.out.format("%d %d\n", row_p2, col_p1);
                }
                if ((row_p2 > 0 && row_p2 < 9) && (col_m1 > 0 && col_m1 < 9)) {
                    System.out.format("%d %d\n", row_p2, col_m1);
                }

                // row-2 , col+-1
                if ((row_m2 > 0 && row_m2 < 9) && (col_p1 > 0 && col_p1 < 9)) {
                    System.out.format("%d %d\n", row_m2, col_p1);
                }
                if ((row_m2 > 0 && row_m2 < 9) && (col_m1 > 0 && col_m1 < 9)) {
                    System.out.format("%d %d\n", row_m2, col_m1);
                }
            }
        }

    } // end of method main
} // end of class Knight