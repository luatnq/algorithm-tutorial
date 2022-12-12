package queue;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DSA07019 {


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

  private static int process(int[] arr, int size) {
    Stack<Integer> stackL = new Stack<>();
    stackL.push(0);
    int a = 0, b = size -1;
    int n = size / 2 ;
    for (int i = 0; i < n; i++) {
      if (arr[stackL.pop()] < arr[i]) {
        a = i;
        break;
      } else {
        stackL.push(i);
      }

    }
    while (!stackL.empty()) stackL.pop();
    stackL.push(size -1);
    for (int i = size -1; i > n; i--){
      if (arr[stackL.peek()] < arr[i]) {
        b = i;
        break;
      } else {
        stackL.push(i);
      }
    }

    return Arrays.stream(Arrays.copyOfRange(arr, a, b)).min().getAsInt() * (b - a + 1);
  }
}
