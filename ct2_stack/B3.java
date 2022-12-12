package ct2_stack;

import java.util.Scanner;
import java.util.Stack;

public class B3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    scan.nextLine();
    while (n-- > 0) {
      String input = scan.nextLine();


      if (check(input)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }

  public static boolean check(String input) {
    input = input.replaceAll("[a-zA-Z0-9_.]", "");
    input= input.replaceAll("\\s+", "");

    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < input.length(); i++) {
      Character character = input.charAt(i);
      if (character == '(' || character == '{' || character == '[') {
        stack.push(character);
      } else {
        if (stack.empty()) return false;
        Character char2 = stack.pop();
        if (character == ')' && char2 != '(') {
          return false;
        } else if (character == '}' && char2 != '{') {
          return false;
        } else if (character == ']' && char2 != '[') {
          return false;
        }
      }
    }
    if (stack.empty()) return true;
    return false;
  }
}
