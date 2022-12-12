//package graph;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class TN06002 {
//
//  static boolean[] check = new boolean[20000];
//  static ArrayList<Integer>[] dsKe = new ArrayList[50000];
//
//  public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    int n = scan.nextInt(), m = scan.nextInt();
//    for (int i = 0; i <= n; i++) {
//      dsKe[i] = new ArrayList<>();
//      check[i] = true;
//    }
//    for (int i = 1; i <= m; i++) {
//      int u = scan.nextInt();
//      int v = scan.nextInt();
//      dsKe[u].add(v);
//      dsKe[v].add(u);
//    }
//    bfs();
//
//
//
//  }
//
//  public static void bfs(int u) {
//    Queue<Integer> queue = new LinkedList<>();
//    queue.add(u);
//    check[u] = false;
//    while (!queue.isEmpty()) {
//      int v = queue.poll();
//      for (Integer x : dsKe[v]) {
//        if (check[x]) {
//          queue.add(x);
//          check[x] = false;
//        }
//      }
//    }
//
//  }
//
////  public static void bfs(int u) {
////    Queue<Integer> queue = new LinkedList<>();
////    queue.add(u);
////    check[u] = false;
////    while (!queue.isEmpty()) {
////      int v = queue.poll();
////      for (Integer i : dsKe[v]) {
////        if (check[i]) {
////          queue.add(i);
////          check[i] = false;
////        }
////      }
////    }
////  }
//}
