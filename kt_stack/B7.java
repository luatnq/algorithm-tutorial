package kt_stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B7 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    Queue<String> queue = new LinkedList<>();
    queue.add("2");
    queue.add("3");
    queue.add("5");
    queue.add("7");
    while (true) {
      String s = queue.poll();
      if (s.length() > n) break;
      long sNum = Long.parseLong(s);
      if (s.contains("2") && s.contains("3") && s.contains("5") && s.contains("7") && sNum % 2 != 0) {
        System.out.println(s);
      }
      queue.add(s + "2");
      queue.add(s + "3");
      queue.add(s + "5");
      queue.add(s + "7");
    }
  }
}
