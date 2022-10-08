package contest;

import java.math.BigInteger;
import java.util.Scanner;

public class ChiaSoLon {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.nextLine();
    while (n-->0) {
      String a = scan.next();
      String b = scan.next();
      BigInteger bigIntegerA = new BigInteger(a);
      BigInteger bigIntegerB = new BigInteger(b);

      BigInteger gcd = bigIntegerA.gcd(bigIntegerB);

      System.out.println(gcd);
    }
  }
}
