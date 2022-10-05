package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class J05081 {

  private static String ITEM_CODE = "MH0";

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt(), i = 1;

    List<Item> items = new ArrayList<>();
    while (i <= n) {
      StringBuilder builderItemCode = new StringBuilder(ITEM_CODE);
      if (i < 10) {
        builderItemCode.append("0").append(i);
      } else {
        builderItemCode.append(i);
      }
      scan.nextLine();

      String name = scan.nextLine();
      String unitName = scan.nextLine();

      int priceIn = scan.nextInt();
      int priceOut = scan.nextInt();
      int profit = priceOut - priceIn;
      items.add(new Item(builderItemCode.toString(), name, unitName, priceIn, priceOut, profit));
      i++;
    }

    items.stream().sorted((o1, o2) -> o2.profit.compareTo(o1.profit)).forEach(System.out::println);
  }


  static class Item {
    private String code;
    private String name;
    private String unitName;
    private Integer priceIn;
    private Integer priceOut;

    private Integer profit;

    public Item() {
    }

    public Item(String code, String name, String unitName, Integer priceIn, Integer priceOut, Integer profit) {
      this.code = code;
      this.name = name;
      this.unitName = unitName;
      this.priceIn = priceIn;
      this.priceOut = priceOut;
      this.profit = profit;
    }

    @Override
    public String toString() {
      return code + " " + name + " " + unitName + " " + priceIn + " " + priceOut + " " + profit;
    }

    public String getCode() {
      return code;
    }

    public void setCode(String code) {
      this.code = code;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getUnitName() {
      return unitName;
    }

    public void setUnitName(String unitName) {
      this.unitName = unitName;
    }

    public Integer getPriceIn() {
      return priceIn;
    }

    public void setPriceIn(Integer priceIn) {
      this.priceIn = priceIn;
    }

    public Integer getPriceOut() {
      return priceOut;
    }

    public void setPriceOut(Integer priceOut) {
      this.priceOut = priceOut;
    }

    public Integer getProfit() {
      return profit;
    }

    public void setProfit(Integer profit) {
      this.profit = profit;
    }
  }
}
