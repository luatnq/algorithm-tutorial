package graph;

import java.util.*;

public class B1 {

  static ArrayList<Integer> dske[] = new ArrayList[1001];
  static boolean[] check = new boolean[1001];
  static int[] track = new int[1001];

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    while (t-- > 0) {
      int n = scan.nextInt(),
            m = scan.nextInt(),
            s = scan.nextInt();
      for (int i = 0; i <= n; i++) {
        dske[i] = new ArrayList<>();
        check[i] = true;
        track[i] = 0;
      }

      for (int index = 1; index <= m; index++) {
        int i = scan.nextInt();
        int j = scan.nextInt();
        dske[i].add(j);
        dske[j].add(i);
      }
      for ( int i=1; i <=n ; i++) {
        if (i == s) continue;
        bfs(s);
        if (check[i]) {
          System.out.println("No path");
        }
        else {
          List<Integer> road = new ArrayList<>();
          int x = i;
          while (x != s) {
            road.add(x);
            x = track[x];
          }
          road.add(s);
          Collections.reverse(road);

          for (Integer integer : road) {
            System.out.print(integer + " ");
          }
        }
        System.out.println();
      }
    }

  }

  public static void bfs(int s) {
    Queue<Integer> q = new LinkedList<>();
    q.add(s);
    check[s] = false;
    while (!q.isEmpty()) {
      int front = q.poll();
      for (Integer i : dske[front]) {
        if (check[i]) {
          q.add(i);
          check[i] = false;
          track[i] = front;
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

