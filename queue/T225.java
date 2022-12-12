package queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class T225 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    while (n-- > 0) {
      int k = scan.nextInt();
      String input = scan.next();

      int[] count = new int[256];
      for (int i = 0; i < input.length(); i++) count[input.charAt(i)]++;
      PriorityQueue<Integer> queue = new PriorityQueue<>((Integer o1, Integer o2) -> o2 - o1);
      for (int i = 0; i < 256; i++) {
        queue.add(count[i]);
      }
      while (k-- > 0) {
        int temp = queue.poll();
        if (temp > 0) {
          temp--;
          queue.add(temp);
        }
      }

      long sum = 0;
      while (!queue.isEmpty()) {
        int temp = queue.poll();
        sum+= (long) temp * temp;
      }
      System.out.println(sum);
    }
  }
}
