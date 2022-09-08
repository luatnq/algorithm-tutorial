package algorithm;

import java.util.Scanner;

public class Covid {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        if (n >= 3 && n <= 1000) {
            int i = 0, count = 0;
            while (i < n - 1) {
                if ( arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    count++;
                    i+=2;
                }else {
                    i++;
                }
            }
            System.out.println(count);
        }
    }
}
