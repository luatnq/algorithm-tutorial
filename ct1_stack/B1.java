package ct1_stack;

import java.util.Scanner;
import java.util.Stack;

public class B1 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    scan.nextLine();
    while (n-- > 0) {
      String line = scan.nextLine();
      Stack<Integer> stack = new Stack<>();
      StringBuilder builder = new StringBuilder();
      int count = 1;
      for (int i = 0; i < line.length(); i++) {
        if (line.charAt(i) == '(') {
          stack.push(count);
          builder.append(count++).append(" ");
        }else if (line.charAt(i) == ')'){
          builder.append(stack.pop()).append(" ");
        }
      }
      System.out.println(builder.toString().trim());
    }
  }
}
