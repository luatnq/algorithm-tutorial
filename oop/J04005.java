package oop;

import java.util.Scanner;

public class J04005 {


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String fullName = scan.nextLine();
    String dob = scan.next();
    float mark1 = scan.nextFloat();
    float mark2 = scan.nextFloat();
    float mark3 = scan.nextFloat();

    Student student = new Student(fullName, dob, (float) (Math.round((mark1 + mark2 + mark3) * 10.0) / 10.0));
    System.out.println(student);
  }


  static class Student {
    private String fullName;
    private String dob;
    private float mark;

    public Student() {
    }

    public Student(String fullName, String dob, float mark) {
      this.fullName = fullName;
      this.dob = dob;
      this.mark = mark;
    }

    public String getFullName() {
      return fullName;
    }

    public void setFullName(String fullName) {
      this.fullName = fullName;
    }

    public String getDob() {
      return dob;
    }

    public void setDob(String dob) {
      this.dob = dob;
    }

    public float getMark() {
      return mark;
    }

    public void setMark(float mark) {
      this.mark = mark;
    }

    @Override
    public String toString() {
      return fullName + " " + dob + " " + mark;
    }
  }
}
