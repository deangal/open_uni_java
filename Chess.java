import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        // scan section
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the type" +
                " of the first chessman");

        char first = scan.next().charAt(0);
        System.out.println("Please enter the number of row");
        int row1 = scan.nextInt();
        System.out.println("Please enter the number of column");
        int col1 = scan.nextInt();
        System.out.println("Please enter the type" +
                " of the second chessman");

        char second = scan.next().charAt(0);
        System.out.println("Please enter the number of row");
        int row2 = scan.nextInt();
        System.out.println("Please enter the number of column");
        int col2 = scan.nextInt();

        // varibales declarions
        boolean isThreat = false;

        String first_string = "";
        String second_string = "";

        if (first == 'b') {
            first_string = "bishop";
        } else if (first == 'k') {
            first_string = "knight";
        } else if (first == 'r') {
            first_string = "rook";
        }

        if (second == 'b') {
            second_string = "bishop";
        } else if (second == 'k') {
            second_string = "knight";
        } else if (second == 'r') {
            second_string = "rook";
        }

        // TO AVOID NESTING THE CHECKS WILL TAKE PLACE AFTER ALL OF THE SCANS TOOK PLACE
        // ( in the order that declared in the mmn11 )
        if (first == second) {
            System.out.println("Chessmen should be different from each other");
        } else if (row1 < 1 || row1 > 8 || row2 < 1 || row2 > 8 || col1 < 1 || col1 > 8 || col2 < 1 || col2 > 8) {
            System.out.println("Position is not legal");
        } else if (row1 == row2 && col1 == col2) {
            System.out.println("Chessmen positions should not be identical");

        } else {
            // first threats seconed check
            // ROOK
            if (first == 'r') {
                // IF COL OR ROW ARE THE SAME ,ROOK MOVED HORIZONTALLY OR VERTICALLY
                if (row1 == row2 || col1 == col2) {
                    isThreat = true;
                }

                // OUTPUT PRINT
                if (isThreat) {
                    System.out.format("%s threats %s\n", first_string, second_string);
                }
            }

            // KNIGHT
            if (first == 'k') {

                int row_p1 = row1 + 1;
                int row_m1 = row1 - 1;
                int row_p2 = row1 + 2;
                int row_m2 = row1 - 2;

                int col_p1 = col1 + 1;
                int col_m1 = col1 - 1;
                int col_p2 = col1 + 2;
                int col_m2 = col1 - 2;

                // ALL POSSIBLE KNIGHT EXACT MOVES
                // row+1 , col+-2
                if ((row_p1 > 0 && row_p1 < 9) && (col_p2 > 0 && col_p2 < 9)) {
                    if (row_p1 == row2 && col_p2 == col2) {
                        isThreat = true;
                    }
                }
                if ((row_p1 > 0 && row_p1 < 9) && (col_m2 > 0 && col_m2 < 9)) {
                    if (row_p1 == row2 && col_m2 == col2) {
                        isThreat = true;
                    }
                }

                // row-1 , col+-2
                if ((row_m1 > 0 && row_m1 < 9) && (col_p2 > 0 && col_p2 < 9)) {
                    if (row_m1 == row2 && col_p2 == col2) {
                        isThreat = true;
                    }
                }
                if ((row_m1 > 0 && row_m1 < 9) && (col_m2 > 0 && col_m2 < 9)) {
                    if (row_m1 == row2 && col_m2 == col2) {
                        isThreat = true;
                    }
                }

                // row+2 , col+-1
                if ((row_p2 > 0 && row_p2 < 9) && (col_p1 > 0 && col_p1 < 9)) {
                    if (row_p2 == row2 && col_p1 == col2) {
                        isThreat = true;
                    }
                }
                if ((row_p2 > 0 && row_p2 < 9) && (col_m1 > 0 && col_m1 < 9)) {
                    if (row_p2 == row2 && col_m1 == col2) {
                        isThreat = true;
                    }
                }

                // row-2 , col+-1
                if ((row_m2 > 0 && row_m2 < 9) && (col_p1 > 0 && col_p1 < 9)) {
                    if (row_m2 == row2 && col_p1 == col2) {
                        isThreat = true;
                    }
                }
                if ((row_m2 > 0 && row_m2 < 9) && (col_m1 > 0 && col_m1 < 9)) {
                    if (row_m2 == row2 && col_m1 == col2) {
                        isThreat = true;
                    }
                }

                // OUTPUT PRINT
                if (isThreat) {
                    System.out.format("%s threats %s\n", first_string, second_string);
                }
            }

            // BISHOP
            if (first == 'b') {
                // CHECKING DIFFRENCE
                int row_diff = row2 - row1;
                int col_diff = col2 - col1;

                // MAKING THEM BOTH POSITIVE TO COMPARE THEM
                if (row_diff < 0) {
                    row_diff = -row_diff;
                }
                if (col_diff < 0) {
                    col_diff = -col_diff;
                }

                // IF BOTH DIFFRENCES ARE THE SAME, BISHOP MOVED DIAGONLLY
                if (row_diff == col_diff) {
                    isThreat = true;
                }

                // OUTPUT PRINT
                if (isThreat) {
                    System.out.format("%s threats %s\n", first_string, second_string);
                }
            } // end of first threats seconed check

            // seconed threats first check
            if (!isThreat) {
                // ROOK
                if (second == 'r') {
                    // IF COL OR ROW ARE THE SAME ,ROOK MOVED HORIZONTALLY OR VERTICALLY
                    if (row1 == row2 || col1 == col2) {
                        isThreat = true;
                    }

                    // OUTPUT PRINT
                    if (isThreat) {
                        System.out.format("%s threats %s\n", second_string, first_string);
                    } else {
                        System.out.println("no threat");
                    }

                }

                // KNIGHT
                if (second == 'k') {

                    int row_p1 = row2 + 1;
                    int row_m1 = row2 - 1;
                    int row_p2 = row2 + 2;
                    int row_m2 = row2 - 2;

                    int col_p1 = col2 + 1;
                    int col_m1 = col2 - 1;
                    int col_p2 = col2 + 2;
                    int col_m2 = col2 - 2;

                    // ALL POSSIBLE KNIGHT EXACT MOVES
                    // row+1 , col+-2
                    if ((row_p1 > 0 && row_p1 < 9) && (col_p2 > 0 && col_p2 < 9)) {
                        if (row_p1 == row1 && col_p2 == col1) {
                            isThreat = true;
                        }
                    }
                    if ((row_p1 > 0 && row_p1 < 9) && (col_m2 > 0 && col_m2 < 9)) {
                        if (row_p1 == row1 && col_m2 == col1) {
                            isThreat = true;
                        }
                    }

                    // row-1 , col+-2
                    if ((row_m1 > 0 && row_m1 < 9) && (col_p2 > 0 && col_p2 < 9)) {
                        if (row_m1 == row1 && col_p2 == col1) {
                            isThreat = true;
                        }
                    }
                    if ((row_m1 > 0 && row_m1 < 9) && (col_m2 > 0 && col_m2 < 9)) {
                        if (row_m1 == row1 && col_m2 == col1) {
                            isThreat = true;
                        }
                    }

                    // row+2 , col+-1
                    if ((row_p2 > 0 && row_p2 < 9) && (col_p1 > 0 && col_p1 < 9)) {
                        if (row_p2 == row1 && col_p1 == col1) {
                            isThreat = true;
                        }
                    }
                    if ((row_p2 > 0 && row_p2 < 9) && (col_m1 > 0 && col_m1 < 9)) {
                        if (row_p2 == row1 && col_m1 == col1) {
                            isThreat = true;
                        }
                    }

                    // row-2 , col+-1
                    if ((row_m2 > 0 && row_m2 < 9) && (col_p1 > 0 && col_p1 < 9)) {
                        if (row_m2 == row1 && col_p1 == col1) {
                            isThreat = true;
                        }
                    }
                    if ((row_m2 > 0 && row_m2 < 9) && (col_m1 > 0 && col_m1 < 9)) {
                        if (row_m2 == row1 && col_m1 == col1) {
                            isThreat = true;
                        }
                    }

                    // OUTPUT PRINT
                    if (isThreat) {
                        System.out.format("%s threats %s\n", second_string, first_string);
                    } else {
                        System.out.println("no threat");

                    }
                }

                // BISHOP
                if (second == 'b') {
                    // CHECKING DIFFRENCE
                    int row_diff = row2 - row1;
                    int col_diff = col2 - col1;

                    // MAKING THEM BOTH POSITIVE TO COMPARE THEM
                    if (row_diff < 0) {
                        row_diff = -row_diff;
                    }
                    if (col_diff < 0) {
                        col_diff = -col_diff;
                    }

                    // IF BOTH DIFFRENCES ARE THE SAME, BISHOP MOVED DIAGONLLY
                    if (row_diff == col_diff) {
                        isThreat = true;
                    }

                    // OUTPUT PRINT
                    if (isThreat) {
                        System.out.format("%s threats %s\n", second_string, first_string);
                    } else {
                        System.out.println("no threat");
                    }
                }
            } // end of second threats first check
        } // end of threats check
    }// end of method main

}// end of Chess class