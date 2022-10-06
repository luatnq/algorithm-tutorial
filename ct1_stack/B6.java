package ct1_stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B6 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while (t-- > 0) {
      int n = scanner.nextInt();
      handle(n);
    }

  }

  public static void handle(int n) {
    Queue<String> q = new LinkedList<>();
    q.add("4");
    q.add("5");
    int count = 0;
    while (count != n) {
      String s = q.poll();
      String s1 = s + "4";
      String s2 = s + "5";
      if (isPrimitive(s1)) {
        System.out.print(s1 + " ");
        count++;
      }
      if (isPrimitive(s2)) {
        System.out.print(s2 + " ");
        count++;
      }
      q.add(s1);
      q.add(s2);
    }
    System.out.println();
  }

  public static boolean isPrimitive(String s) {
    StringBuilder sb = new StringBuilder();
    sb.append(s);
    String revStr = sb.reverse().toString();
    return revStr.equals(s) && s.length() % 2 == 0 && s.length() > 1;
  }

}
