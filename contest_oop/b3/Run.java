package contest_oop.b3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Run {

  private static String PATTERN = "[]";

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("DATA.in");
    Scanner scan = new Scanner(file);

    List<String> list = new ArrayList<>();
    while (scan.hasNextLine()) {
      String line = scan.nextLine();
      StringTokenizer stringTokenizer = new StringTokenizer(line);

      while (stringTokenizer.hasMoreTokens()) {
        String token = stringTokenizer.nextToken();
        try {
          int number = Integer.valueOf(token);
        } catch (Exception e) {
          list.add(token);
        }
      }
    }
    StringBuilder builder = new StringBuilder();
    list.stream().sorted().forEach(s -> builder.append(s).append(" "));

    System.out.println(builder.toString().trim());
  }
}
