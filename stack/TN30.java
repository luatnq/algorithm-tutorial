package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TN30 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    while (n-- > 0) {
      System.out.println(process(scan.nextInt(), scan.nextInt()));

    }
  }

  public static int process(int s, int t) {
    if (s > t) return s - t;
    Queue<Integer> queue = new LinkedList<>();
    int[] arr = new int[10001];
    queue.add(s);
    while (arr[t] == 0) {
      int top = queue.poll();

      if (top - 1 > 0 && arr[top - 1] == 0) {
        arr[top - 1] = arr[top] + 1;
        queue.add(top - 1);
      }
      if (top * 2 < 10000 && arr[top * 2] == 0) {
        arr[top * 2] = arr[top] + 1;
        queue.add(top * 2);
      }
    }

    return arr[t];
  }
}
