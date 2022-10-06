package oop.j07010;

public class Student {

  private String code;
  private String name;
  private String className;
  private String dob;
  private float gpa;

  public Student() {
  }

  public Student(int count, String name, String className, String dob, float gpa) {
    this.code = "B20DCCN" + (count < 10 ? ("00" + count) : ("0" + count));
    this.name = name;
    this.className = className;
    this.dob = dob;
    this.gpa = gpa;
  }

  @Override
  public String toString() {
    return code + " " + name + " " + className + " " + dob + " " + String.format("%.2f", gpa);
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
}
