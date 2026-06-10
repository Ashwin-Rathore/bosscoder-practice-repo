package SelfPracticeFolder.Java.BitManipulation;

import java.util.Scanner;

public class PowerOf2Only {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Insert Number for Power :  ");
    int n = sc.nextInt();
    System.out.println(1 << n);

  }
}
