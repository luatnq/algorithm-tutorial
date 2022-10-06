package oop.j07052;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Run {
  private static double pointAccessGlobal = 0;

  public static void main(String[] args) throws FileNotFoundException {
    Map<String, Double> map = new HashMap<>();
    map.put("KV1", 0.5);
    map.put("KV2", 1.0);
    map.put("KV3", 2.5);

    File file = new File("THISINH.in");
    Scanner scan = new Scanner(file);

    int n = scan.nextInt();
    List<Student> students = new ArrayList<>();
    while (n-- > 0) {
      scan.nextLine();
      String code = scan.nextLine();
      String name = scan.nextLine();
      double mark1 = scan.nextDouble();
      double mark2 = scan.nextDouble();
      double mark3 = scan.nextDouble();

      Double pointPriority = map.get(code.substring(0, 3));
      double pointAccess = mark1 * 2 + mark2 + mark3 + pointPriority;
      Student student = new Student(code, handleName(name.toLowerCase()), pointPriority, pointAccess, null);

      students.add(student);
    }


    int numStudent = 0;
    if (students.size() > 0) {
      numStudent = scan.nextInt();
    }

    sort(students);
    List<Student> studentsHandled = getStudentAccess(students, numStudent);
    System.out.println(pointAccessGlobal);
    studentsHandled.forEach(System.out::println);

  }

  private static List<Student> getStudentAccess(List<Student> students, int numberStudent) {

    double pointAccess = 0;
    int count = 0;
    for (int i = 0; i < students.size(); i++) {
      Student student = students.get(i);

      if (student.getPointAccess() > pointAccess) {
        pointAccess = student.getPointAccess();
      }

      if (count == numberStudent && pointAccess == student.getPointAccess()) {
        students.get(i).setStatus("TRUNG TUYEN");
      } else if (count < numberStudent) {
        students.get(i).setStatus("TRUNG TUYEN");
        count++;
      }
    }

    pointAccessGlobal = pointAccess;

    students.forEach(student -> {
      if (Objects.isNull(student.getStatus())) {
        student.setStatus("TRUOT");
      }
    });
    return students;
  }


  private static void sort(List<Student> students) {
    Collections.sort(students, new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        int pointCompare = Double.compare(o2.getPointAccess(), o1.getPointAccess());
        if (pointCompare == 0) {
          return o1.getCode().compareTo(o2.getCode());
        }
        return pointCompare;
      }
    });
  }

  private static String handleName(String name) {
    String preName = name.trim();

    String[] nameArr = preName.split("\\s+");
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < nameArr.length; i++) {
      builder.append(String.valueOf(nameArr[i].charAt(0)).toUpperCase().concat(nameArr[i].substring(1))).append(" ");
    }
    return builder.toString().trim();
  }


}
