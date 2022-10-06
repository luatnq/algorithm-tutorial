package kt.hcn;

import java.util.Scanner;

public class Run {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int width = scan.nextInt();
    int height = scan.nextInt();
    String color = scan.next();

    if (width <= 0 || height <= 0){
      System.out.println("INVALID");
    }else {
      Rectange rectange = new Rectange(width, height, handleString(color.trim().toLowerCase()));
      System.out.println(String.format("%.0f", rectange.findPerimeter()) + " " + String.format("%.0f", rectange.findArea()) + " " + rectange.getColor());
    }
  }

  private static String handleString(String str){
    String[] strArr = str.split("\\s+");
    StringBuilder builder = new StringBuilder();
    for (int i=0; i< strArr.length; i++){
      builder.append(String.valueOf(strArr[i].charAt(0)).toUpperCase().concat(strArr[i].substring(1))).append(" ");
    }
    return builder.toString().trim();

  }
}
