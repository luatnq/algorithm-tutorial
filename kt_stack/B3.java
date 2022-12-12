package kt_stack;

import java.util.Scanner;
import java.util.Stack;

public class B3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    while (n-- > 0) {
      int size = scan.nextInt();
      scan.nextLine();
      String input = scan.nextLine().trim();

      process(input, size);
    }
  }

  private static void process(String input, int size) {
    String[] optArr = input.split(" ");
    Stack<Long> stack = new Stack<>();
    for (int i = size - 1; i >= 0; i--) {
      if (optArr[i].equals("*")) {
        long opt1 = stack.pop();
        long opt2 = stack.pop();

        long temp = opt1 * opt2;
        stack.push(temp);
      } else if (optArr[i].equals("+")) {
        long opt1 = stack.pop();
        long opt2 = stack.pop();

        long temp = opt1 + opt2;
        stack.push(temp);
      } else if (optArr[i].equals("/")) {
        long opt1 = stack.pop();
        long opt2 = stack.pop();

        long temp = opt1 / opt2;
        stack.push(temp);
      } else if (optArr[i].equals("-")) {
        long opt1 = stack.pop();
        long opt2 = stack.pop();

        long temp = opt1 - opt2;
        stack.push(temp);
      } else {
        stack.push(Long.parseLong(optArr[i]));
      }

    }
    System.out.println(stack.peek());
  }
}
