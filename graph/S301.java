package graph;

import java.util.*;

public class S301 {
<<<<<<< HEAD

  static int m, n;
  static boolean[] check = new boolean[1001];
  static int track[] = new int[1001];
  static ArrayList<Integer>[] dsKe = new ArrayList[1001];
=======
  static int m, n;
  static ArrayList<Integer>[] dsKe = new ArrayList[1001];
  static boolean[] check = new boolean[1001];
  static int[] track = new int[1001];
>>>>>>> 3c771e575d2234b9e2a629cc33afacb2793113dd

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    while (t-- > 0) {
      n = scan.nextInt();
      m = scan.nextInt();
<<<<<<< HEAD
      int s = scan.nextInt(), e = scan.nextInt();
=======
      int s = scan.nextInt();
      int e = scan.nextInt();
>>>>>>> 3c771e575d2234b9e2a629cc33afacb2793113dd
      for (int i = 0; i <= n; i++) {
        dsKe[i] = new ArrayList<>();
        check[i] = true;
        track[i] = 0;
      }
      for (int i = 1; i <= m; i++) {
<<<<<<< HEAD
        int u = scan.nextInt();
        int v = scan.nextInt();
=======
        int u = scan.nextInt(), v = scan.nextInt();
>>>>>>> 3c771e575d2234b9e2a629cc33afacb2793113dd
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
<<<<<<< HEAD

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

=======
        road.add(s);
        Collections.reverse(road);
        for (Integer integer : road){
          System.out.print(integer + " ");
        }
>>>>>>> 3c771e575d2234b9e2a629cc33afacb2793113dd
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
<<<<<<< HEAD
//      System.out.print(v + " ");
      for (Integer x : dsKe[v]) {
        if (check[x]) {
          queue.add(x);
          check[x] = false;
          track[x] = v;
        }
      }
    }
=======
      System.out.print(v + " ");
      for (Integer integer : dsKe[v]) {
        if (check[integer]) {
          queue.add(integer);
          check[integer] = false;
        }
      }
    }

>>>>>>> 3c771e575d2234b9e2a629cc33afacb2793113dd
  }
}

/*
<<<<<<< HEAD
1 -> 2 -> 5 -> 6
=======
>>>>>>> 3c771e575d2234b9e2a629cc33afacb2793113dd
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
<<<<<<< HEAD
 */
=======


 */
>>>>>>> 3c771e575d2234b9e2a629cc33afacb2793113dd
