package oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07004 {
  private static final String PATTERN = "^[0-9-]{1,11}$";

  public static void main(String[] args) throws FileNotFoundException {

    File file = new File("DATA.in");
    Scanner scan = new Scanner(file);
    Map<Integer, Integer> map = new TreeMap<>();

    while (scan.hasNextInt()) {
      int number = scan.nextInt();
      if (!map.containsKey(number)) {
        map.put(number, 1);
      } else {
        map.put(number, map.get(number) + 1);
      }

    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

  }
}
//
//public class Test2 {
//  public static void main(String[] args) throws IOException {
//    DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
//    int a[] = new int[1000];
//    for (int i = 0; i < 100000; i++) {
//      a[in.readInt()]++;
//    }
//    for (int j = 0; j < 1000; j++) {
//      if (a[j] > 0) {
//        System.out.println(j + " " + a[j]);
//      }
//    }
//  }
//}


