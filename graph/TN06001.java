package graph;

import java.util.*;

public class TN06001 {


  static int n, m;
  static boolean[] check = new boolean[1001];
  static ArrayList<Integer>[] dsKe = new ArrayList[1001];
  static int[] track = new int[1001];

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    while (t-- > 0) {
      n = scan.nextInt();
      m = scan.nextInt();
      int s = scan.nextInt();
      int e = scan.nextInt();

      for (int i = 0; i <= n; i++) {
        dsKe[i] = new ArrayList<>();
        check[i] = true;
        track[i] = 0;
      }
      for (int i = 1; i <= m; i++) {
        int u = scan.nextInt(), v = scan.nextInt();
        dsKe[u].add(v);
        dsKe[v].add(u);
      }

      bfs(s);
      if (check[e]) {
        System.out.println(-1);
      } else {
        ArrayList<Integer> road = new ArrayList<>();
        int x = e;
        while (x != s) {
          road.add(x);
          x = track[x];
        }

        road.add(s);
        Collections.reverse(road);
        for (int i = 0; i < road.size(); i++) {
//          if (i == road.size() -1){
//            System.out.print(road.get(i));
//          }else {
//            System.out.print(road.get(i) + " -> ");
//          }
          System.out.print(road.get(i) + " ");
        }
        System.out.println();
      }
//      }
    }
  }

//  public static void dfs(int u) {
//    check[u] = false;
//    for (Integer in : dsKe[u]) {
//      if (check[in]) {
//        dfs(in);
//        track[in] = u;
//      }
//    }
//  }


  public static void bfs(int u) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(u);
    check[u] = false;
    while (!queue.isEmpty()) {
      int v = queue.poll();
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
1
6 9 1 6
1 2 1 3 2 3 2 5 3 4 3 5 4 5 4 6 5 6
 */
