package oop;

public class Example {


  public static void main(String[] args) {
    int[] arrInput = new int[]{2, 7, 9, 3, 1};
    int[] arrCheck = new int[]{0, 0, 0, 0, 0};
    int n = 5, i = 0;
    int[] arrRes = new int[n];

    while (n-- > 0) {
      int index = getNumberMax(arrInput, arrCheck);
      if (index == -1) break;
      arrRes[i++] = index;
      arrCheck[index] = 1;

      System.out.println(index);
    }
//    System.out.println(arrRes.toString());
  }


  private static int getNumberMax(int[] arrInput, int[] arrCheck) {
    int maxValue = 0;
    int indexMax = -1;
    for (int i = 0; i < arrInput.length; i++) {
      if (arrInput[i] > maxValue && arrCheck[i] == 0) {
        if (i > 0 && i == arrCheck.length - 1 && arrCheck[i - 1] == 1) {
          continue;
        }
        if (i > 0 && i < arrCheck.length - 1 && arrCheck[i - 1] == 1 ||
            i > 0 && i < arrCheck.length - 1 && arrCheck[i + 1] == 1) {
          continue;
        }
        if (i == 0 && arrCheck[i + 1] == 1) {
          continue;
        }

        maxValue = arrInput[i];
        indexMax = i;
      }
    }

    return indexMax;
  }
}
