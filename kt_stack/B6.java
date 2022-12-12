package kt_stack;

import java.util.*;

public class B6 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    while (n-- > 0) {
      int size = scan.nextInt();
      process2(size);
    }
  }

  private static void process2(int size) {
    Queue<String> queue = new LinkedList<>();
    queue.add("");
    int count = 0;
    while (true) {
      String s = queue.poll();
      if (s.length()*2 > size) break;
      if (!s.equals("")) {
        System.out.print(s);
      }

      for (int i = s.length() - 1; i >= 0; i--) {
        System.out.print(s.charAt(i));
      }
      if (!s.equals("")) {
        System.out.print(" ");
      }

      queue.add(s + "0");
      queue.add(s + "1");
    }
    System.out.println();
  }

  private static void process(int size) {
    Queue<String> queue = new LinkedList<>();
    queue.add("0");
    queue.add("1");
    Set<String> list = new TreeSet<>();
    while (true) {
      String s = queue.poll();

      String s1 = s + "0";
      if (s1.length() > size) break;
      else if (s1.length() % 2 == 0 && check(s1)) {

        list.add(s1);


      }
      queue.add(s1);
      String s2 = s + "1";
      if (s2.length() > size) break;
      else if (s2.length() % 2 == 0 && check(s2)) {

        list.add(s2);
      }
      queue.add(s2);
    }

    list.stream().sorted(((s, t1) -> s.length() - t1.length())).forEach(value -> System.out.print(value + " "));
    System.out.println();
  }

  private static boolean check(String st) {
    StringBuilder builder = new StringBuilder(st);
    if (builder.reverse().toString().equals(st)) {
      return true;
    }
    return false;
  }
}
