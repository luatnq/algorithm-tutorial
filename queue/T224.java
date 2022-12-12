package queue;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class T224 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    while (n-- > 0) {
      long amount = scan.nextLong();
      process(amount);
    }
  }

  private static void process(long amount) {
    Queue<String> queue = new LinkedList<>();
    queue.add("9");
    BigInteger bigValue = BigInteger.valueOf(amount);
    if (9 % amount == 0) {
      System.out.println(9);
      return;
    }
    while (true) {
      String s = queue.poll();
      String s1 = s + "0";
      String s2 = s + "9";

      if (new BigInteger(s1).mod(bigValue).compareTo(BigInteger.ZERO) == 0) {
        System.out.println(s1);
        break;
      }
      queue.add(s1);
      if (new BigInteger(s2).mod(bigValue).compareTo(BigInteger.ZERO) == 0) {
        System.out.println(s2);
        break;
      }
      queue.add(s2);
    }
  }
}
