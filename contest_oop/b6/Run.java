package contest_oop.b6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
  private static int TIME_START = 360;
  private static int LONG_ROAD = 120;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<VDV> vdvs = new ArrayList<>();
    int n = scan.nextInt();
    while (n-- > 0) {
      scan.nextLine();
      String name = scan.nextLine();
      String unit = scan.nextLine();
      int timeEnd = convertTimeToMinus(scan.next());

      VDV vdv = new VDV(getCode(unit, name), name, unit, calSpeed(TIME_START, timeEnd));
      vdvs.add(vdv);
    }

    vdvs.stream()
        .sorted(((o1, o2) -> Double.compare(o2.getAverageSpeed(), o1.getAverageSpeed())))
        .forEach(System.out::println);

  }

  private static double calSpeed(int timeStart, int timeEnd) {
    double time = (double) (timeEnd - timeStart) / 60;
    return 120 / time;
  }

  private static String getCode(String unit, String name) {
    String[] unitArr = unit.split("\\s+");
    String[] nameArr = name.split("\\s+");
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < unitArr.length; i++) {
      builder.append(unitArr[i].charAt(0));
    }

    for (int i = 0; i < nameArr.length; i++) {
      builder.append(nameArr[i].charAt(0));
    }

    return builder.toString().trim();
  }

  private static int convertTimeToMinus(String time) {
    String[] timeArr = time.split(":");
    return Integer.parseInt(timeArr[0]) * 60 + Integer.parseInt(timeArr[1]);
  }
}


