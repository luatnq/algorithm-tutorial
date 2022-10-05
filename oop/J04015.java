package oop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J04015 {


  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("HT", 2000000);
    map.put("HP", 900000);
    map.put("GV", 500000);

    Scanner scan = new Scanner(System.in);
    String code = scan.next();
    int bonus = map.get(code.substring(0, 2));
    int level = Integer.valueOf(code.substring(2));
    scan.nextLine();
    String fullName = scan.nextLine();
    int salaryBase = scan.nextInt();

    Teacher teacher = new Teacher(code, fullName, level + "", bonus + "", salaryBase * level + bonus + "");
    System.out.println(teacher);
  }

  static class Teacher {
    private String code;
    private String fullName;
    private String wage;
    private String bonus;
    private String salary;

    public Teacher() {
    }

    public Teacher(String code, String fullName, String wage, String bonus, String salary) {
      this.code = code;
      this.fullName = fullName;
      this.wage = wage;
      this.bonus = bonus;
      this.salary = salary;
    }

    @Override
    public String toString() {
      return code + " " + fullName + " " + wage + " " + bonus + " " + salary;
    }

    public String getCode() {
      return code;
    }

    public void setCode(String code) {
      this.code = code;
    }

    public String getFullName() {
      return fullName;
    }

    public void setFullName(String fullName) {
      this.fullName = fullName;
    }

    public String getWage() {
      return wage;
    }

    public void setWage(String wage) {
      this.wage = wage;
    }

    public String getBonus() {
      return bonus;
    }

    public void setBonus(String bonus) {
      this.bonus = bonus;
    }

    public String getSalary() {
      return salary;
    }

    public void setSalary(String salary) {
      this.salary = salary;
    }
  }
}
