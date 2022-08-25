package algorithm;

import java.util.Scanner;

public class TwoSum {

  private final static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int[] arr = input();
    int x = scanner.nextInt();

    subtractionNumber(arr, arr.length, x);

  }

  public static int[] input(){
    int n = scanner.nextInt();
    int[] arr = new int[n];

    int index = 0;
    while (n > 0){
      arr[index++] = scanner.nextInt();
      n--;
    }

    return arr;
  }

  public static void subtractionNumber(int[] arr, int n, int x){
    for (int i = 0; i < n; i++){

      int indexNumber2 = search(arr, n, x - arr[i]);
      if (indexNumber2 != -1){
        System.out.println(i + " " + indexNumber2);
        break;
      }
    }
  }

  public static int search(int[] arr, int n, int x) {
    int beginIndex = 0;
    int lastIndex = n - 1;

    while (lastIndex >= beginIndex) {
      int mid = beginIndex + (lastIndex - beginIndex) / 2;

      if (arr[mid] == x) {
        return mid;
      }
      if (arr[mid] > x) {
        lastIndex = mid - 1;
      }
      if (arr[mid] < x){
        beginIndex = mid + 1;
      }
    }
    return -1;
  }
}
