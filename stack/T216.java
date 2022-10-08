package stack;

import java.util.Scanner;
import java.util.Stack;

public class T216 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.nextLine();
    while (n-- > 0) {
      String input = scan.nextLine();
      Stack<Integer> stack = new Stack<>();

      for (int i = input.length() -1; i >= 0; i--) {
        char characterChecking = input.charAt(i);

        if (characterChecking == '*') {
          int op1 = stack.pop();
          int op2 = stack.pop();

          int temp = op1 * op2;
          stack.push(temp);
        } else if (characterChecking == '+') {
          int op1 = stack.pop();
          int op2 = stack.pop();

          int temp = op1 + op2;
          stack.push(temp);
        } else if (characterChecking == '-') {
          int op1 = stack.pop();
          int op2 = stack.pop();

          int temp = op1 - op2;
          stack.push(temp);
        } else if (characterChecking == '/') {
          int op1 = stack.pop();
          int op2 = stack.pop();

          int temp = op1 / op2;
          stack.push(temp);
        } else {
          stack.push(characterChecking - '0');
        }
      }

      System.out.println(stack.peek());
    }
  }
}
