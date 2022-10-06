package oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07007 {

  public static void main(String[] args) throws FileNotFoundException {

    File file = new File("VANBAN.in");
    Scanner scan = new Scanner(file);
    Set<String> set = new TreeSet<>();

    while (scan.hasNextLine()) {
      String line = scan.nextLine();
      StringTokenizer stringTokenizer = new StringTokenizer(line);

      while (stringTokenizer.hasMoreTokens()) {
        set.add(stringTokenizer.nextToken().toLowerCase());
      }
    }
    set.forEach(System.out::println);

  }
}
