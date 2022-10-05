package stack;

import java.util.Scanner;
import java.util.Stack;

public class TN04003 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    while (n-- > 0) {
      int size = scan.nextInt();
      int[] arr = new int[size];

      for (int i = 0; i < size; i++) {
        arr[i] = scan.nextInt();
      }
      System.out.println(process(arr, size));
    }
  }

  private static String process(int[] a, int n) {
    Stack<Integer> stack = new Stack<>();

    int[] kq = new int[n + 1];
    kq[0] = 1;
    for (int i = n - 1; i >= 0; i--) {
      while (!stack.empty() && a[stack.peek()] < a[i]) {
        kq[stack.peek()] = stack.pop() - i;
      }
      stack.push(i);
    }

    while (!stack.isEmpty()) {
      kq[stack.peek()] = stack.pop() + 1;
    }

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < n; i++) {
      builder.append(kq[i]).append(" ");
    }

    return builder.toString().trim();
  }
}
