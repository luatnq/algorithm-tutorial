package algorithm;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(handleNumber(1211));
    }

    private static boolean handleNumber(int x) {
        if (x < 0) return false;
        if (x > 0 && x < 10) return true;

        String xStr = String.valueOf(x);
        int begin = 0, end = xStr.length() - 1;
        while (begin < end){
            if (xStr.charAt(begin ++) != xStr.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
