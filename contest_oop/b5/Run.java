package contest_oop.b5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {

  private static String CODE = "TS";

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt(), i = 1;

    List<Student> students = new ArrayList<>();

    while (i <= n) {
      scan.nextLine();
      String fullName = scan.nextLine();
      double mark1 = scan.nextDouble();
      double mark2 = scan.nextDouble();
      double averageMark = calAverageMark(mark1, mark2);
      Student student = new Student(getCode(i++), fullName, averageMark, getStatus(averageMark));
      students.add(student);
    }

    students.stream().sorted(((o1, o2) -> Double.compare(o2.getMark(), o1.getMark()))).forEach(System.out::println);
  }

  private static double calAverageMark(double mark1, double mark2) {
    double total = 0.0;
    if (mark1 > 10) {
      total +=  mark1 / 10;
    } else {
      total += mark1;
    }
    if (mark2 > 10) {
      total += (double) mark2 / 10;
    } else {
      total += mark2;
    }

    return total / 2 ;
  }

  private static String getCode(int i) {
    if (i < 10) {
      return CODE + "0" + i;
    }
    return CODE + i;
  }

  public static String getStatus(double mark) {
    String res = "";
    if (mark < 5) {
      res = "TRUOT";
    } else if (mark >= 5 && mark < 8) {
      res = "CAN NHAC";
    } else if (mark >= 8 && mark < 9.5) {
      res = "DAT";
    } else if (mark >= 9.5) {
      res = "XUAT SAC";
    }

    return res.trim();
  }
}
