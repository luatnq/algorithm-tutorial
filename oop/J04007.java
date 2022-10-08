package oop;

import java.util.Scanner;

public class J04007 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String fullName = scan.nextLine();
    String sex = scan.nextLine();
    String dob = scan.nextLine();
    String address = scan.nextLine();
    String taxCode = scan.nextLine();
    String contractDate = scan.nextLine();
    Employee employee  = new Employee(fullName, sex, dob, address, taxCode, contractDate);
    System.out.println(employee);
  }


  static class Employee {
    private String code;
    private String fullName;
    private String sex;
    private String dob;
    private String address;
    private String taxCode;
    private String contractDate;

    public Employee(String fullName, String sex, String dob, String address, String taxCode, String contractDate) {
      this.code = "00001";
      this.fullName = fullName;
      this.sex = sex;
      this.dob = dob;
      this.address = address;
      this.taxCode = taxCode;
      this.contractDate = contractDate;
    }

    public Employee() {
    }

    @Override
    public String toString() {
      return code + " " + fullName + " " + sex + " " + dob + " " +
          address + " " + taxCode + " " + contractDate;
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

    public String getSex() {
      return sex;
    }

    public void setSex(String sex) {
      this.sex = sex;
    }

    public String getDob() {
      return dob;
    }

    public void setDob(String dob) {
      this.dob = dob;
    }

    public String getAddress() {
      return address;
    }

    public void setAddress(String address) {
      this.address = address;
    }

    public String getTaxCode() {
      return taxCode;
    }

    public void setTaxCode(String taxCode) {
      this.taxCode = taxCode;
    }

    public String getContractDate() {
      return contractDate;
    }

    public void setContractDate(String contractDate) {
      this.contractDate = contractDate;
    }
  }
}
