package kt.icpc;

import java.util.*;

public class Run {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int teamNumber = scan.nextInt();
    Map<String, String> map = new HashMap<>();
    List<Student> students = new ArrayList<>();
    int i = 1;
    scan.nextLine();
    while (teamNumber-- > 0) {
      String key = i < 10 ? ("Team0" + i) : ("Team" + i);
      String value = scan.nextLine().trim() + "//" + scan.nextLine().trim();
      map.put(key, value);
      i++;
    }

    int studentNumber = Integer.parseInt(scan.nextLine().trim());
    i = 1;
//    scan.nextLine();
    while (studentNumber-- > 0) {
      String code = getCode(i++);
      String name = scan.nextLine().trim();
      String team = scan.nextLine().trim();
      String[] teamArr = map.get(team).split("//");

      Student student = new Student(code, name, teamArr[0], teamArr[1]);
      students.add(student);
    }

    students.stream().sorted(((o1, o2) -> o1.getName().compareTo(o2.getName()))).forEach(System.out::println);
  }

  private static String getCode(int i) {
    if (i < 10) {
      return "C00" + i;
    } else if (i < 100) {
      return "C0" + i;
    } else {
      return "C" + i;
    }
  }
}
