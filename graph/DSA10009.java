package graph;

import java.util.Scanner;

public class DSA10009 {
  static int a[][] = new int[105][105];
  static int n, m;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i, j, u, v, w;
    n = scan.nextInt();
    m = scan.nextInt();
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= n; j++) {
        if (i==j) a[i][j] = 0;
        else a[i][j]
      }
    }
  }
}
