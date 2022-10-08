package queue;

import java.util.*;

public class S213 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    while (n-- > 0) {
      Queue<String> queue = new LinkedList<>();
      int length = scan.nextInt();
      List<String> res = new ArrayList<>();
      res.add("6");
      res.add("8");

      queue.add("6");
      queue.add("8");
      while (true) {
        String s = queue.poll();

        String s1 = s.concat("6");

        if (s1.length() > length) break;
        queue.add(s1);
        res.add(s1);
        String s2 = s.concat("8");
        if (s2.length() > length) break;
        queue.add(s2);
        res.add(s2);
      }
      System.out.println(res.size());
      for (int i = res.size() - 1; i >= 0; i--) {
        System.out.print(res.get(i) + " ");
      }
      System.out.println();
    }
  }
}
