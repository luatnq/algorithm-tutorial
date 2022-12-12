package queue;

import java.util.*;

public class T221 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    while (n-- > 0) {
      int amount = scan.nextInt();
      process(amount);
    }
  }

  private static void process(int amount) {
    Queue<String> queue = new LinkedList<>();
    queue.add("1");
    int count = 1;
    List<String> res = new ArrayList<>();
    res.add("1");
    while (count < amount) {
      String s = queue.poll();
      String s1 = s + "0";
      String s2 = s + "1";

      queue.add(s1);
      res.add(s1);
      count++;
      if (count >= amount) break;
      queue.add(s2);
      res.add(s2);
      count++;
    }
    res.forEach(value -> System.out.print(value + " "));
    System.out.println();
  }
}
