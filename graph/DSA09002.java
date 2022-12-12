package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class DSA09002 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int v = sc.nextInt();
    sc.nextLine();
    ArrayList<String>[] dsCanh = new ArrayList[v + 1];
    for (int i = 1; i <= v; i++) {
      dsCanh[i] = new ArrayList<>();
    }
    for (int i = 1; i <= v; i++) {
      String n = sc.nextLine();
      String[] strArr = n.split(" ");
      for (int j = 0; j < strArr.length; j++)
        if (i < Integer.parseInt(strArr[j]))
          dsCanh[i].add(strArr[j]);
    }
    for (int i = 1; i <= v; i++) {
      for (int j = 0; j < dsCanh[i].size(); j++)
        System.out.println(i + " " + dsCanh[i].get(j));
    }
  }
}

/*
3
2 3
1 3
1 2
 */
