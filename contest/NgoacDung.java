package contest;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NgoacDung {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String[] strArr = new String[n];
    scan.nextLine();
    for (int i = 0; i < n; i++) {
      strArr[i] = scan.nextLine();
    }
    int i = 0;
    while (n-- > 0) {
      System.out.println(handle(strArr[i++]));
    }
  }

  private static int handle(String input) {

    Stack<Character> stack = new Stack<>();
    if (input.matches("\\s+")) return input.length();
    int result = 0, index = 0;
    int[] resultArr = new int[input.length()];

    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '(') {
        stack.push('(');
      } else if (input.charAt(i) == ')' && !stack.isEmpty() && stack.pop() == '(') {
        result++;
      } else {
        resultArr[index++] = result;
        result = 0;
      }
    }

    return Arrays.stream(resultArr).max().getAsInt() * 2;

  }
}
