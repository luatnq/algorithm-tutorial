package graph;

import java.util.*;

public class S301 {

  static int m, n;
  static boolean[] check = new boolean[1001];
  static int track[] = new int[1001];
  static ArrayList<Integer>[] dsKe = new ArrayList[1001];

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    while (t-- > 0) {
      n = scan.nextInt();
      m = scan.nextInt();
      int s = scan.nextInt(), e = scan.nextInt();
      for (int i = 0; i <= n; i++) {
        dsKe[i] = new ArrayList<>();
        check[i] = true;
        track[i] = 0;
      }
      for (int i = 1; i <= m; i++) {
        int u = scan.nextInt();
        int v = scan.nextInt();
        dsKe[u].add(v);
      }
      bfs(s);
      if (check[e]) System.out.println(-1);
      else {
        ArrayList<Integer> road = new ArrayList<>();
        int x = e;
        while (x != s) {
          road.add(x);
          x = track[x];
        }

        road.add(s);
        Collections.reverse(road);
        for (int i = 0; i < road.size(); i++) {
          if (i == road.size() - 1) {
            System.out.print(road.get(i));
            continue;
          }else {
            System.out.print(road.get(i) + " -> ");
          }
        }

        System.out.println();
      }
    }
  }

  public static void bfs(int u) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(u);
    check[u] = false;
    while (!queue.isEmpty()) {
      int v = queue.poll();
//      System.out.print(v + " ");
      for (Integer x : dsKe[v]) {
        if (check[x]) {
          queue.add(x);
          check[x] = false;
          track[x] = v;
        }
      }
    }
  }
}

/*
1 -> 2 -> 5 -> 6
1
6 9 1 6
1 2
2 5
3 1
3 2
3 5
4 3
5 4
5 6
6 4
 */
