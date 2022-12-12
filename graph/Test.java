////package graph;
////
////package Prac4;
////
////import java.util.*;
////
////public class Bai1 {
////  static ArrayList<Integer>[] dsKe = new ArrayList[1001];
////  static int[] prv = new int[1001];
////  static boolean[] check = new boolean[1001];
////
////  public static void main(String[] args) {
////    Scanner sc = new Scanner(System.in);
////    int t = sc.nextInt();
////    while (t-- > 0) {
////      int v = sc.nextInt();
////      int e = sc.nextInt();
////      int s = sc.nextInt();
////      int f = sc.nextInt();
////      for (int i = 1; i <= v; i++) {
////        dsKe[i] = new ArrayList<>();
////        check[i] = true;
////        prv[i] = 0;
////      }
////      for (int j = 1; j <= e; j++) {
////        int n = sc.nextInt();
////        int m = sc.nextInt();
////        dsKe[n].add(m);
////      }
////      bfs(s);
////      if (check[f]) System.out.println(-1);
////      else {
////        List<Integer> path = new ArrayList<>();
////        int x = f;
////        while (x != s) {
////          path.add(x);
////          x = prv[x];
////        }
////        path.add(s);
////        Collections.reverse(path);
////        for (Integer i : path) {
////          System.out.print(i + " ");
////        }
////        System.out.println();
////      }
////    }
////  }
////
////  public static void bfs(int s) {
////    Queue<Integer> q = new LinkedList<>();
////    q.add(s);
////    check[s] = false;
////    while (!q.isEmpty()) {
////      int front = q.poll();
////      for (Integer i : dsKe[front]) {
////        if (check[i]) {
////          q.add(i);
////          check[i] = false;
////          prv[i] = front;
////        }
////      }
////    }
////  }
////
////  public static void dfs(int s) {
////    check[s] = false;
////    for (Integer i : dsKe[s]) {
////      if (check[i]) {
////        dfs(i);
////        prv[i] = s;
////      }
////    }
////  }
////}
//
//
//ublic class Bai2 {
//  static ArrayList<Integer>[] dsKe = new ArrayList[1001];
//  static int[] prv = new int[1001];
//  static boolean[] check = new boolean[1001];
//
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int t = sc.nextInt();
//    while (t-- > 0) {
//      int v = sc.nextInt();
//      int e = sc.nextInt();
//      int s = sc.nextInt();
//      for (int i = 0; i <= v; i++) {
//        dsKe[i] = new ArrayList<>();
//        check[i] = true;
//        prv[i] = 0;
//      }
//      for (int j = 1; j <= e; j++) {
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        dsKe[n].add(m);
//        dsKe[m].add(n);
//      }
//      for (int k = 1; k <= v; k++) {
//        if (k == s) continue;
//        bfs(s);
//        if (check[k]) System.out.println("No path");
//        else {
//          List<Integer> path = new ArrayList<>();
//          int x = k;
//          while (x != s) {
//            path.add(x);
//            x = prv[x];
//          }
//          path.add(s);
//          Collections.reverse(path);
//          for (Integer i : path) {
//            System.out.print(i + " ");
//          }
//        }
//        System.out.println();
//      }
//
//    }
//  }
//
//  public static void bfs(int s) {
//    Queue<Integer> q = new LinkedList<>();
//    q.add(s);
//    check[s] = false;
//    while (!q.isEmpty()) {
//      int front = q.poll();
//      for (Integer i : dsKe[front]) {
//        if (check[i]) {
//          q.add(i);
//          check[i] = false;
//          prv[i] = front;
//        }
//      }
//    }
//  }
//
//  public static void dfs(int s) {
//    check[s] = false;
//    for (Integer i : dsKe[s]) {
//      if (check[i]) {
//        dfs(i);
//        prv[i] = s;
//      }
//    }
//  }
//}