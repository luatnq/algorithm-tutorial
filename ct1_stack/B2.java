package ct1_stack;

import java.util.Scanner;
import java.util.Stack;

public class B2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    scan.nextLine();
    while (n-- > 0) {
      String line = scan.nextLine();
      System.out.println(check(line));
    }
  }

  private static String check(String line) {

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < line.length(); i++) {
      char characterChecking = line.charAt(i);

      if (characterChecking == '(' || characterChecking == '{' || characterChecking == '[') {
        stack.push(characterChecking);
      } else {
        if (stack.empty()) return "false";
        Character character = stack.pop();
        if (characterChecking == ')' && character != '(') {
          return "false";
        } else if (characterChecking == '}' && character != '{') {
          return "false";
        } else if (characterChecking == ']' && character != '[') {
          return "false";
        }
      }
    }
    if (stack.empty()) return "true";
    return "false";
  }
}
