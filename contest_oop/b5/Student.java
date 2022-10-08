package contest_oop.b5;

public class Student {
  private String code;
  private String fullName;
  private double mark;
  private String status;

  public Student() {
  }

  public Student(String code, String fullName, double mark, String status) {
    this.code = code;
    this.fullName = fullName;
    this.mark = mark;
    this.status = status;
  }

  public Student(String fullName, double mark, String status) {
    this.fullName = fullName;
    this.mark = mark;
    this.status = status;
  }

  @Override
  public String toString() {
    return code + " " + fullName + " " + String.format("%.2f", mark) + " " + status;
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

  public double getMark() {
    return mark;
  }

  public void setMark(double mark) {
    this.mark = mark;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
