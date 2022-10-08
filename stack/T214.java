package stack;

import java.util.Scanner;
import java.util.Stack;

public class T214 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.nextLine();
    while (n-- > 0) {
      String input = scan.nextLine();
      Stack<String> stack = new Stack<>();
      StringBuilder builder = new StringBuilder();
      for (int i = input.length() - 1; i >= 0; i--) {
        char characterChecking = input.charAt(i);
        if (characterChecking == '*' ||
            characterChecking == '+' ||
            characterChecking == '-' ||
            characterChecking == '/') {
          String op1 = stack.pop();
          String op2 = stack.pop();

          String temp = op1.concat(op2).concat(characterChecking + "");

          stack.push(temp);
        } else {
          stack.push(characterChecking + "");
        }
      }

      System.out.println(stack.peek());
    }
  }
}
