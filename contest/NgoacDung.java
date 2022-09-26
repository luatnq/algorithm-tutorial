package contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class NgoacDung {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt(), index = 0;
    List<String> list = new ArrayList<>();
    scan.nextLine();
    while (n-- > 0) {
      String input = scan.next();

      list.add(handle(input).trim());
    }

    list.forEach(System.out::println);
  }

  private static String handle(String input) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < input.length(); i++) {

      Character charChecking = input.charAt(i);
      if (charChecking == '(' || charChecking == '{' || charChecking == '[') {
        stack.push(charChecking);
      } else if (charChecking == ')' && !stack.empty() && stack.pop() != '(') {
        return "NO";
      } else if (charChecking == '}' && !stack.empty() && stack.pop() != '{') {
        return "NO";
      } else if (charChecking == ']' && !stack.empty() && stack.pop() != '[') {
        return "NO";
      }
    }
    return "YES";
  }


}
