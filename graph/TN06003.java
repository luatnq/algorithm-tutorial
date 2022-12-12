package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TN06003 {
  static ArrayList<Integer>[] dsKe = new ArrayList[1001];
  static boolean[] check = new boolean[1001];

  //lien thong (Liet ke nhung dinh khong lien thong)
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int v = sc.nextInt();
    int e = sc.nextInt();
    int s = sc.nextInt();
    for (int i = 0; i <= v; i++) {
      dsKe[i] = new ArrayList<>();
      check[i] = true;
    }
    for (int j = 1; j <= e; j++) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      dsKe[n].add(m);
      dsKe[m].add(n);
    }
    bfs(s);
    int count = 0;
    for (int i = 1; i <= v; i++) {
      if (check[i]) {
        System.out.println(i);
        count++;
      }
    }
    if (count == 0) System.out.println(count);
  }

  public static void bfs(int u) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(u);
    check[u] = false;
    while (!queue.isEmpty()) {
      int v = queue.poll();
      for (Integer i : dsKe[v]) {
        if (check[i]) {
          queue.add(i);
          check[i] = false;
        }
      }
    }
  }
}

/*
6 4 2
1 3
2 3
1 2
4 5
 */