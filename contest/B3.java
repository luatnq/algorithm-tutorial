package contest;

import java.util.Scanner;

public class B3 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt(), i = 0;
    int[] arr = new int[n];
    while (n-- > 0) {
      arr[i++] = scan.nextInt();
    }

    handle(arr, n);
  }

  private static void handle(int[] arr, int n) {

    for (int i = 1; i < n; i++) {
      int key = arr[i];
      int j = i - 1;

      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }

  }

  private static void print(int[] arr, int step) {
    System.out.print("Buoc " + step + ": ");
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        System.out.print(arr[i]);
      } else {
        System.out.print(arr[i] + " ");
      }
    }
    System.out.println();
  }


}
