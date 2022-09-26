package contest;

import java.util.Scanner;

public class T205 {

  static int MODULO = 1000000000 + 7;

  private static long pow(int a, int b) {
    if (b == 1) {
      return a;
    } else if (b == 0) {
      return 1;
    }
    long temp = pow(a, b / 2);
    if (b % 2 == 0) return (temp * temp) % MODULO;
    else {
      return (((temp * temp) % MODULO)*a)  % MODULO;
    }

  }


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    while (n-- > 0) {
      System.out.println(pow(scan.nextInt(), scan.nextInt()));
    }
  }
}
