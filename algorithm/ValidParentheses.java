package algorithm;

import java.util.Stack;

public class ValidParentheses {

  public static void main(String[] args) {
    System.out.println(checkStr("()["));
  }

  public static boolean checkStr(String str) {
    Stack stack = new Stack();

    for (int i = 0; i < str.length(); i++) {

      char ch = str.charAt(i);

      if (ch == '(' || ch == '{' || ch == '[') {
        stack.push(ch);
      } else if (stack.empty()) {
        return false;
      } else if (ch == ']' && (char) stack.pop() != '[') {
        return false;
      } else if (ch == ')' && (char) stack.pop() != '(') {
        return false;
      } else if (ch == '}' && (char) stack.pop() != '{') {
        return false;
      }

    }

    return stack.isEmpty();
  }

}
