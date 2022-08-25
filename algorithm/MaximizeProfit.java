package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximizeProfit {

  public static void main(String[] args) {
    int[] prices = new int[]{7, 6, 4, 3, 1};
    maxProfit(prices);
  }

  public static int maxProfit(int[] prices) {

    int maxProfit = 0, n = prices.length;
    for (int i = 0; i < n - 1; i++) {
      int[] subPrices = Arrays.copyOfRange(prices, i+1, n - 1);
      Arrays.stream(subPrices).max();
      for (int j = i + 1; j < n; j++) {
        int temp = prices[j] - prices[i];

        if (maxProfit < temp) {
          maxProfit = temp;
        }
      }

    }

    return maxProfit;
  }
}
