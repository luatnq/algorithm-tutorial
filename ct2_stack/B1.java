package ct2_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class B1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    while (n-- > 0) {
      int size = scan.nextInt();
      int[] arr = new int[size];

      for (int i = 0; i < size; i++) {
        arr[i] = scan.nextInt();
      }

      process(arr, size);
    }
  }

  private static void process(int[] arr, int n) {
    Stack<Integer> stack = new Stack<>();
    int[] kq = new int[n ];
    kq[0] = 1;
    for (int i = n - 1; i >= 0; i--) {
      while (!stack.empty() && arr[stack.peek()] < arr[i]) {
        kq[stack.peek()] = stack.pop() - i;
      }
      stack.push(i);
    }

    while (!stack.isEmpty()) {
      kq[stack.peek()] = stack.pop() + 1;
    }

    Arrays.stream(kq).forEach(value -> System.out.print(value + " "));
    System.out.println();
  }

}
