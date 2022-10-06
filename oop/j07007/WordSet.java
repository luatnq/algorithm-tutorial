package oop.j07007;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordSet {

  private String wordSet = "";

  public WordSet(String pathFile) throws IOException {

    File file = new File(pathFile);
    Scanner scan = new Scanner(file);
    Set<String> setInternal = new TreeSet<>();

    while (scan.hasNextLine()) {
      String line = scan.nextLine();
      StringTokenizer stringTokenizer = new StringTokenizer(line);

      while (stringTokenizer.hasMoreTokens()) {
        setInternal.add(stringTokenizer.nextToken().toLowerCase());
      }
    }
    StringBuilder builder = new StringBuilder();
    for (String str : setInternal) {
      builder.append(str).append("\n");
    }
    wordSet = builder.toString().trim();
  }

  @Override
  public String toString() {
    return wordSet;
  }
}
