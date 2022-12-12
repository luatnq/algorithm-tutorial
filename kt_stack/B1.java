package kt_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class B1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    while (n-- > 0) {
      String input = scan.next();
      process(input);
    }
  }

  private static void process(String input) {
    Stack<Integer> stack = new Stack<>();
    String[] arr = new String[input.length()];
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '(') {
        stack.push(i);
        arr[i] = "0";
      } else if (input.charAt(i) == ')' && stack.empty()) arr[i] = "-1";
      else if (input.charAt(i) == ')') {
        arr[i] = "1";
        stack.pop();
      } else arr[i] = String.valueOf(input.charAt(i));
    }
    while (!stack.empty()) arr[stack.pop()] = "-1";
    Arrays.stream(arr).forEach(value -> System.out.print(value));
    System.out.println();
  }
}
