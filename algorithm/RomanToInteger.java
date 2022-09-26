package algorithm;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(changeRoman(convertRomanToInteger("CVIII")));
    }
    private static int[] convertRomanToInteger(String roman) {

        int[] arr = new int[roman.length()];

        for (int i = 0; i < roman.length(); i++) {
            if (roman.charAt(i) == 'I')
                arr[i] = 1;
            else if (roman.charAt(i) == 'V')
                arr[i] = 5;
            else if (roman.charAt(i) == 'X')
                arr[i] = 10;
            else if (roman.charAt(i) == 'L')
                arr[i] = 50;
            else if (roman.charAt(i) == 'C')
                arr[i] = 100;
            else if (roman.charAt(i) == 'D')
                arr[i] = 500;
            else if (roman.charAt(i) == 'M')
                arr[i] = 1000;

        }
        return arr;

    }

    private static int changeRoman(int[] arr) {
        int n = arr.length;

        int numberResult = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {

            if (numberResult > arr[i]) {
                numberResult -= arr[i];
            } else if (numberResult <= arr[i]) {
                numberResult += arr[i];
            }

        }
        return numberResult;
    }
}
