package contest;

import java.util.Scanner;
import java.util.Stack;

public class DaoTu {

  public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    String[] strArr = new String[n];
    scan.nextLine();
    for (int i = 0; i < n; i++) {
      strArr[i] = scan.nextLine();
    }

    for (int j = 0; j < n; j++) {

      String str = strArr[j];
      Stack<Character> charList = new Stack<>();
      StringBuilder builder = new StringBuilder();
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ' ' && !charList.isEmpty()) {
          while (!charList.isEmpty()) {
            builder.append(charList.pop());
          }
        }
        if (str.charAt(i) == ' ') {
          builder.append(' ');
        } else {
          charList.push(str.charAt(i));
        }
      }
      while (!charList.isEmpty()) {
        builder.append(charList.pop());
      }
      System.out.println(builder.toString().trim());

    }
  }
}
