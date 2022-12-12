package queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class TN14 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long mod = (long) (10e9 + 7);
    while (n-- > 0) {

      int size = scan.nextInt();

      PriorityQueue<Integer> queue = new PriorityQueue<>();
      for (int i = 0; i < size; i++) {
        queue.add(scan.nextInt());
      }
      int sum = 0;

      while (queue.size() > 1) {
        int min1 = queue.poll(), min2 = queue.poll();
        int res = (int) ((min1 + min2) % mod);
        queue.add(res);
        sum = (int) ((res + sum) % mod);
      }
      System.out.println(sum);
    }
  }

}
