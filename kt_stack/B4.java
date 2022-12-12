package kt_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class B4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int size = scan.nextInt();
    int[] arr = new int[size];
    int[] arr2 = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = scan.nextInt();
      arr2[i] = n - arr[i];
    }
    int a = process(size, arr);
    int b = process(size, arr2);
    System.out.println(Math.max(a, b));
  }

  private static int process(int size, int[] arr) {
    Stack<Integer> stackL = new Stack<>();
    stackL.push(0);
    int a = 0, b = size - 1;
    int n = size / 2;
    for (int i = 0; i < size; i++) {
      if (arr[stackL.pop()] < arr[i]) {
        a = i;
        break;
      } else {
        stackL.push(i);
      }

    }
    while (!stackL.empty()) stackL.pop();
    stackL.push(size - 1);
    for (int i = size - 1; i > n; i--) {
      if (arr[stackL.peek()] < arr[i]) {
        b = i;
        break;
      } else {
        stackL.push(i);
      }
    }
    System.out.println(a + " " + b);
    return Arrays.stream(Arrays.copyOfRange(arr, a, b)).min().getAsInt() * (b - a + 1);

  }
}
