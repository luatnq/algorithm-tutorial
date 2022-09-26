package contest;

import java.util.Scanner;

public class B1 {

//sắp xếp đổi chõ trực tiếp
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt(), i = 0;
    int[] arr = new int[n];
    while (n-- > 0) {
      arr[i++] = scan.nextInt();
    }

    handle(arr);
  }

  private static void handle(int[] arr) {

    int step = 1;
    for (int i = 0; i < arr.length - 1; i++) {

      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
      print(arr, step++);
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
