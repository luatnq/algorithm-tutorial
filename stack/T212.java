package stack;

import java.util.Scanner;
import java.util.Stack;

public class T212 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    scan.nextLine();
    while (n-- > 0) {
      String input = scan.nextLine();

      if (check(input)) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }

  public static boolean check(String input) {
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '(') {
        stack.push(i);
      } else if (input.charAt(i) == ')') {
        int indexTop = stack.pop();
        if (i - indexTop == 2) return true;
        if (input.charAt(indexTop + 1) == '(' && input.charAt(i - 1) == ')') return true;
      }
    }

    return false;

  }
}
