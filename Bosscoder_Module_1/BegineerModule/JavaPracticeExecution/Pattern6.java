// * * * * *
// *       *
// *       *
// *       *
// * * * * *

package Bosscoder_Module_1.BegineerModule.JavaPracticeExecution;

public class Pattern6 {

    public static void pattern(int row, int column) {

        for (int i = 0; i < row; i++) {

            for (int j = 0; j <= column; j++) {
                if (i == 0 || i == column) {
                    System.out.print("* ");
                } else if (i != 0 || i == column - 1) {
                    {
                        for (int k = 0; k <= column; k++) {
                            if (j == 0 || j == column) {
                                System.out.print("* ");
                                break;
                            } else
                                System.out.print("  ");
                            break;
                        }
                    }

                }
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {

        pattern(5, 4);

    }

}
