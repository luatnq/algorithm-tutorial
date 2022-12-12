package stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class T218 {
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

  public static void process(int[] arr, int size) {

    int[] res = new int[size];
    Stack<Integer> stack = new Stack<>();
    for (int i = size - 1; i >= 0; i--) {
      while (!stack.empty() && arr[i] >= stack.peek()) stack.pop();
      if (stack.empty()) res[i] = -1;
      else res[i] = stack.peek();
      stack.push(arr[i]);
    }

    Arrays.stream(res).forEach(value -> System.out.print(value + " "));
    System.out.println();
  }
}
