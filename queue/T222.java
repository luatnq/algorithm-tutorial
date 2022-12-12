package queue;

import java.util.*;

public class T222 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    while (n-- > 0) {
      long amount = scan.nextLong();
      process(amount);
    }
  }

  private static void process(long amount) {
    Queue<String> queue = new LinkedList<>();
    queue.add("1");
    int count = 1;
    while (true) {
      String s = queue.poll();
      String s1 = s + "0";
      String s2 = s + "1";

      if (Long.parseLong(s1) > amount) break;
      queue.add(s1);
      count++;
      if (Long.parseLong(s2) > amount) break;
      queue.add(s2);
      count++;
    }
    System.out.println(count);
  }
}
