package oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001 {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("DATA.in");
    Scanner scanner = new Scanner(file);
    while (scanner.hasNextLine()) {
      System.out.println(scanner.nextLine());
    }
    scanner.close();
  }
}
