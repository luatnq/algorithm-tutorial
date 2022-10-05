package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class TN04001 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    scan.nextLine();
    List<String> res = new ArrayList<>();
    while (n-- > 0) {
      Stack<Integer> stack = new Stack<>();

      String line = scan.nextLine().trim();
      StringBuilder builder = new StringBuilder();
      int count = 1;
      for (int i = 0; i < line.length(); i++) {
        if (line.charAt(i) == '(') {
          stack.push(count);
          builder.append(count).append(" ");
          count++;
        } else if (line.charAt(i) == ')') {
          builder.append(stack.pop()).append(" ");
        }
      }
      res.add(builder.toString().trim());
    }

    res.forEach(System.out::println);
  }
}
