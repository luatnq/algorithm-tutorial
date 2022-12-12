package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class DSA09001 {

  static ArrayList[] dsKe = new ArrayList[1001];
  static boolean[] check = new boolean[1001];
  static int[] track = new int[1001];

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    while (t-- > 0) {
      int v = scan.nextInt();
      int e = scan.nextInt();
//      int s = scan.nextInt();
      for (int i = 0; i <= v; i++) {
        dsKe[i] = new ArrayList();
//        check[i] = true;
//        track[i] = 0;
      }
      for (int j = 1; j <= e; j++) {
        int n = scan.nextInt(), m = scan.nextInt();
        dsKe[n].add(m);
        dsKe[m].add(n);
      }

      for (int i = 1; i <= v; i++) {
        System.out.print(i + ": ");
        for (Object integer : dsKe[i]){
          System.out.print(integer + " ");
        }
        System.out.println();
      }
    }
  }
}


/*
1
6  9
1  2
1  3
2  3
2  5
3  4
3  5
4  5
4  6
5  6
 */