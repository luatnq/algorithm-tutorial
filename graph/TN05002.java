package graph;

import java.util.*;

public class TN05002 {

  static int n, m;
  static ArrayList<Integer>[] dsKe = new ArrayList[1001];
  static boolean[] check = new boolean[1001];

  // bfs do thi vo huong
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    while (t-- > 0) {
      n = scan.nextInt();
      m = scan.nextInt();
      int s = scan.nextInt();
      List<Integer> arr = new ArrayList<>();
      for (int i = 0; i <= n; i++) {
        dsKe[i] = new ArrayList<>();
        check[i] = true;
      }

      for (int i = 1; i <= m; i++) {
        int u = scan.nextInt();
        int v = scan.nextInt();
        dsKe[u].add(v);
        dsKe[v].add(u);
      }
      System.out.print("BFS(" + s + ") = ");
      bfs(s, arr);
      for (int i = 0; i < arr.size(); i++){
        if (i == arr.size() -1){
          System.out.print(arr.get(i));
        }else {
          System.out.print(arr.get(i) + " -> ");
        }
      }
      System.out.println();

    }
  }

  public static void bfs(int u, List<Integer> arr) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(u);
    check[u] = false;
    while (!queue.isEmpty()) {
      int v = queue.poll();
      arr.add(v);
      for (Integer x : dsKe[v]) {
        if (check[x]) {
          queue.add(x);
          check[x] = false;
        }
      }
    }
  }
}
/*
1
6 9 1
1 2 1 3 2 3 2 5 3 4 3 5 4 5 4 6 5 6
 */
