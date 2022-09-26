package contest;

import java.util.Scanner;

public class B4 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String[] strArr = new String[n];

    scan.nextLine();
    for (int i = 0; i < n; i++) {
      strArr[i] = scan.nextLine();
    }

    int i = 0;
    while (n-- > 0) {
      StringBuilder str = new StringBuilder(strArr[i++]);
      System.out.println(str.reverse().toString());
    }
  }
}
