package oop.j07052;

public class Student {
  private String code;
  private String name;
  private double pointPriority;
  private double pointAccess;

  private String status;

  public Student() {
  }

  public Student(String code, String name, double pointPriority, double pointAccess, String status) {
    this.code = code;
    this.name = name;
    this.pointPriority = pointPriority;
    this.pointAccess = pointAccess;
    this.status = status;
  }

  @Override
  public String toString() {
    return code + " " + name + " " + pointPriority + " " + String.format("%.1f", pointAccess) + " " + status;
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

  public double getPointPriority() {
    return pointPriority;
  }

  public void setPointPriority(double pointPriority) {
    this.pointPriority = pointPriority;
  }

  public double getPointAccess() {
    return pointAccess;
  }

  public void setPointAccess(double pointAccess) {
    this.pointAccess = pointAccess;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
