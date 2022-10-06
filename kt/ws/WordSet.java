package kt.ws;

import java.util.*;

public class WordSet {

  private String str;

  private Set<String> set = new TreeSet<>();

  public WordSet(String str) {
    this.str = str.toLowerCase();
    StringTokenizer stringTokenizer = new StringTokenizer(this.str);
    while (stringTokenizer.hasMoreTokens()) {
      this.set.add(stringTokenizer.nextToken());
    }
  }

  public WordSet() {
  }


  public WordSet union(WordSet s2) {
    WordSet ws = new WordSet();
    ws.set.addAll(this.set);
    ws.set.addAll(s2.set);
    return ws;
  }

  public WordSet intersection(WordSet s2) {
    WordSet ws = new WordSet();
    ws.set.addAll(this.set);
    ws.set.retainAll(s2.set);

    return ws;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    for (String s :this.set) {
      builder.append(s).append(" ");
    }
    return builder.toString().trim();
  }
}
