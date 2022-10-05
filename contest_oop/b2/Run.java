package contest_oop.b2;

import contest_oop.b2.Point;

import java.util.Scanner;

public class Run {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    while (n-- > 0) {
      double x1 = scan.nextDouble();
      double y1 = scan.nextDouble();

      Point point1 = new Point(x1, y1);
      double x2 = scan.nextDouble();
      double y2 = scan.nextDouble();

      Point point2 = new Point(x2, y2);

      double x3 = scan.nextDouble();
      double y3 = scan.nextDouble();
      Point point3 = new Point(x3, y3);

      double a = point1.distance(point2);
      double b = point1.distance(point3);
      double c = point2.distance(point3);
      if (a + b > c && a + c > b && c + b > a) {
        System.out.println(String.format("%.3f", a + b + c));
      }else {
        System.out.println("INVALID");
      }
    }
  }
}
