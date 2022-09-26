package icpc;

import java.util.Map;
import java.util.Scanner;

public class B1Contest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.print(handle(n));
    }

    public static long handle(long n) {

        if (n < 0) return 0;
        if (n <= 10 && n >= 1) return n;

        int[] numberArr = splitNumber(n);

        int firstNumber = numberArr[0];
        int secondNumber = numberArr[1];
        if (secondNumber >=5 ) numberArr[0] = firstNumber + 1;

        return syntheticNumber(numberArr);
    }

    private static long syntheticNumber(int[] numberArr) {
        long result = (long) (numberArr[0] * Math.pow(10, numberArr.length - 1));
        return result;
    }

    private static int[] splitNumber(long n) {
        String nStr = String.valueOf(n).trim();
        int[] arr = new int[nStr.length()];
        for (int i = nStr.length() - 1; i >= 0; i--) {
            arr[i] = nStr.charAt(i) - '0';
        }

        return arr;
    }
}
