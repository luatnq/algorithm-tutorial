package icpc;

import java.util.Scanner;

public class B3Contest3 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String a = scan.next(), b = scan.next();

    System.out.print(handle(a, b));
  }

  private static int handle(String a, String b) {
//    String aStr = String.valueOf(a);
//    String bStr = String.valueOf(b);
    int result = 1;
    for (int i = 0; i <= 3; i++) {
        if (a.charAt(i) == b.charAt(i)){
          result*=1;
        }else{
          result*=2;
        }
    }
    return result;
  }
}
