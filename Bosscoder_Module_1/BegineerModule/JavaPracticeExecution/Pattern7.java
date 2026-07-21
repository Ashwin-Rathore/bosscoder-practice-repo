//     *
//    * *
//   *   *
//  *     *
//   *   *
//    * *
//     *

package Bosscoder_Module_1.BegineerModule.JavaPracticeExecution;

public class Pattern7 {

  public static void main(String[] args) {

        int n = 3;

        // Upper Half
        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars and inner spaces
            for (int j = 1; j <= (2 * i - 1); j++) {

                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 1; i--) {

            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars and inner spaces
            for (int j = 1; j <= (2 * i - 1); j++) {

                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

}

