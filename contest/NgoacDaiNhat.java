package contest;

import java.util.Scanner;
import java.util.Stack;

public class NgoacDaiNhat {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt(), index = 0;
    int[] resultArr = new int[n];
    scan.nextLine();
    while (n-- > 0) {
      String input = scan.next();

      Stack<Integer> stack = new Stack<>();
      stack.push(-1);

      int result = 0;
      for (int i = 0; i < input.length(); i++) {
        if (input.charAt(i) == '(') {
          stack.push(i);
        } else {
          stack.pop();
          if (!stack.empty()) {
            result = Math.max(result, i - stack.peek());
          } else {
            stack.push(i);
          }
        }
      }
      resultArr[index++] = result;
    }

    for (int i = 0; i < index; i++) {
      System.out.println(resultArr[i]);
    }
  }
}

