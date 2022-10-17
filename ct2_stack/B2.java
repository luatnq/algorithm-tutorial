package ct2_stack;

import java.util.Scanner;
import java.util.Stack;

public class B2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    scan.nextLine();
    while (n-- > 0) {
      String input = scan.nextLine();
      Stack<Integer> stack = new Stack<>();
      for (int i = input.length() - 1; i >= 0; i--) {
        Character character = input.charAt(i);

        if (character == '+') {
          int op1 = stack.pop();
          int op2 = stack.pop();

          int temp = op1 + op2;
          stack.push(temp);
        } else if (character == '*') {
          int op1 = stack.pop();
          int op2 = stack.pop();

          int temp = op1 * op2;
          stack.push(temp);
        } else if (character == '/') {
          int op1 = stack.pop();
          int op2 = stack.pop();

          int temp = op1 / op2;
          stack.push(temp);
        } else if (character == '-') {
          int op1 = stack.pop();
          int op2 = stack.pop();

          int temp = op1 - op2;
          stack.push(temp);
        } else {
          stack.push(character - '0');
        }
      }

      System.out.println(stack.peek());
    }
  }
}
