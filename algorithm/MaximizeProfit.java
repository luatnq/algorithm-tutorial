package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximizeProfit {

  public static void main(String[] args) {
    int[] prices = new int[]{2,6,1,4,8,3};
    int[] result = maxProfit(prices);

    System.out.println("Begin: " + result[0] + "  End: " + result[1]);
  }

  public static int[] maxProfit(int[] prices) {

    int maxProfit = 0, n = prices.length, indexBegin = 0, indexEnd = 0;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        int temp = prices[j] - prices[i];

        if (maxProfit < temp) {
          indexBegin = i;
          indexEnd = j;
          maxProfit = temp;
        }
      }

    }

    return new int[]{indexBegin, indexEnd};
  }
}
