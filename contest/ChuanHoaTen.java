package contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChuanHoaTen {

  public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    List<String> list = new ArrayList<>();
    while (n-- > 0) {
      int type = scan.nextInt();
      scan.nextLine();
      list.add(compositeName(handleName(split(scan.nextLine())), type));
    }
    list.forEach(System.out::println);


  }

  private static String[] split(String fullName) {
    return fullName.split("\\s+");
  }

  private static String[] handleName(String[] nameArr) {
    for (int i = 0; i < nameArr.length; i++) {
      String temp = nameArr[i].toLowerCase();

      nameArr[i] = String.valueOf(temp.charAt(0)).toUpperCase() + temp.substring(1);
    }

    return nameArr;
  }


  private static String compositeName(String[] nameArr, int type) {
    StringBuilder builder = new StringBuilder();
    if (type == 1) {
      builder.append(nameArr[nameArr.length - 1]).append(" ");
      for (int i = 0; i < nameArr.length - 1; i++) {
        builder.append(nameArr[i]).append(" ");
      }
    } else if (type == 2) {
      for (int i = 1; i < nameArr.length; i++) {
        builder.append(nameArr[i]).append(" ");
      }
      builder.append(nameArr[0]);
    }
    return builder.toString().trim();
  }
}
