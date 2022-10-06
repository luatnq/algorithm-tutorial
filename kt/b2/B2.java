package kt.b2;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class B2 {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("SONGUYEN.IN");
    Scanner scan = new Scanner(file);
    int n = scan.nextInt();
    while (n-- > 0) {
      BigInteger bigIntegerA = new BigInteger(scan.next());
      BigInteger bigInteger7 = new BigInteger("7");
      BigInteger bigInteger13 = new BigInteger("13");

      int mod7 = bigIntegerA.mod(bigInteger7).compareTo(new BigInteger("0"));
      int mod13 = bigIntegerA.mod(bigInteger13).compareTo(new BigInteger("0"));
      if (mod7 == 0 && mod13 == 0) {
        System.out.println("Both");
      } else if (mod7 == 0){
        System.out.println("Div 7");
      }else if (mod13 == 0){
        System.out.println("Div 13");
      }else {
        System.out.println("None");
      }
    }
  }
}
