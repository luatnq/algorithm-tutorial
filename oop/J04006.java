package oop;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class J04006 {

  private final static SimpleDateFormat formatFull = new SimpleDateFormat("dd/MM/yyyy");
  private final static SimpleDateFormat format = new SimpleDateFormat("d/M/yyyy");

  public static void main(String[] args) throws ParseException {
    Scanner scan = new Scanner(System.in);
    String fullName = scan.nextLine();
    String className = scan.next();
    String dob = scan.next();
    float mark1 = scan.nextFloat();

    Student student = new Student(
        fullName,
        className,
        formatFull.format(format.parse(dob)),
        (float) (Math.floor(mark1 * 100.0) / 100.0)
    );
    System.out.println(student);
  }


  static class Student {
    private String maSv;
    private String fullName;
    private String className;
    private String dob;
    private float gpa;

    public Student() {
      maSv = "";
      fullName = "";
      className = "";
      dob = "";
      gpa = 0;
    }

    public Student(String fullName, String className, String dob, float gpa) {
      this.maSv = "B20DCCN001";
      this.fullName = fullName;
      this.className = className;
      this.dob = dob;
      this.gpa = gpa;
    }

    public String getMaSv() {
      return maSv;
    }

    public void setMaSv(String maSv) {
      this.maSv = maSv;
    }

    public String getFullName() {
      return fullName;
    }

    public void setFullName(String fullName) {
      this.fullName = fullName;
    }

    public String getClassName() {
      return className;
    }

    public void setClassName(String className) {
      this.className = className;
    }

    public String getDob() {
      return dob;
    }

    public void setDob(String dob) {
      this.dob = dob;
    }

    public float getGpa() {
      return gpa;
    }

    public void setGpa(float gpa) {
      this.gpa = gpa;
    }

    @Override
    public String toString() {
      return maSv + " " + fullName + " " + className + " " + dob + " " + String.format("%.2f", this.gpa);
    }
  }
}
