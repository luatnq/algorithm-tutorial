package oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class J07002 {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("/home/luatnq/workspace/growth-self/algorithm-tutorial/oop/DATA.in");
    Scanner scan = new Scanner(file);

    long totalNumber = 0;
    
    List<String> list = new ArrayList<>();
    while (scan.hasNextLine()) {
      String line = scan.nextLine();
      StringTokenizer stringTokenizer = new StringTokenizer(line);

      while (stringTokenizer.hasMoreTokens()) {

        String word = stringTokenizer.nextToken();
        if (word.matches("^[0-9-]{1,11}$")) {
          long number = Long.parseLong(word);

          if (number <= 2147483647 && number >= -2147483648) {
            totalNumber += number;
          }
        }
      }

    }

    System.out.println(totalNumber);


  }
}
