package icpc;

import java.util.Arrays;
import java.util.Scanner;

public class B1Contest3 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scan.nextInt();
    }

    int[] result = handle(arr);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }


  private static int[] handle(int[] numberArr) {
    int n = numberArr.length, index = 0;
    int[] result = new int[n];
    for (int i = 0; i < n - 1; i++) {
      int a = numberArr[i];

      for (int j = i + 1; j < n; j++) {
        int b = numberArr[j];
        if (b % a == 0) {
          result[index++] = b;
          i = j;
          break;
        }
      }
    }
    return Arrays.stream(result).limit(index).toArray();
  }
}
