package oop.j07010;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J07010 {


  private static final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

  public static void main(String[] args) throws FileNotFoundException, ParseException {
    File file = new File("/home/luatnq/workspace/growth-self/algorithm-tutorial/oop/DATA.in");
    Scanner scan = new Scanner(file);
    int n = scan.nextInt(), i = 1;
    List<Student> students = new ArrayList<>();
    while (n-- > 0) {
      scan.nextLine();
      String name = scan.nextLine();
      String className = scan.nextLine();
      String dob = format.format(format.parse(scan.nextLine().trim()));
      float gpa = scan.nextFloat();

      Student student = new Student(i++, name, className, dob, gpa);
      students.add(student);
    }
    students.forEach(System.out::println);
  }
}
