package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TN05001 {
  static int n, m;
  static ArrayList<Integer> dsKe[] = new ArrayList[1001];
  static boolean[] check = new boolean[1001];

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    while (t-- > 0) {
      List<Integer> list = new ArrayList<>();

      n = scan.nextInt();
      m = scan.nextInt();
      int s = scan.nextInt();
      for (int i = 0; i <= n; i++) {
        dsKe[i] = new ArrayList<>();
        check[i] = true;
      }
      for (int i = 1; i <= m; i++) {
        int u = scan.nextInt(), v = scan.nextInt();
        dsKe[u].add(v);
        dsKe[v].add(u);
      }
      System.out.print("DFS(" + s + ") = ");
      dfs(s, list);
      for (int i = 0; i < list.size(); i++) {
        if (i == list.size() - 1) {
          System.out.print(list.get(i));
        } else {
          System.out.print(list.get(i) + " -> ");
        }
      }
      System.out.println();
    }
  }

  public static void dfs(int u, List<Integer> list) {
//    System.out.print(u + " -> ");
    list.add(u);
    check[u] = false;
    for (Integer integer : dsKe[u]) {
      if (check[integer]) dfs(integer, list);
    }
  }
}

/*
1
6 9 5
1 2
1 3
2 3
2 4
3 4
3 5
4 5
4 6
5 6
 */
