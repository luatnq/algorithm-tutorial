package kt.b1;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class B1 {

  public static void main(String[] args) throws FileNotFoundException {
    Scanner scan = new Scanner(new File("DATA.in"));
    long res = 0;
//    BigInteger res = new BigInteger("0");
    while (scan.hasNextLine()) {
      try {
        long number = Long.parseLong(scan.next());
        if (number > 2147483647) {
          res += number;
        }
      } catch (Exception e) {

      }
    }

    System.out.println(res);

  }
}
