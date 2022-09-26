package oop.j04003;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong(), b = scan.nextLong();
    long n = gcd(a, b);
    if (n == 0){
      PhanSo phanSo = new PhanSo(a, b);
      System.out.println(phanSo);
    }else{
      PhanSo phanSo = new PhanSo(a/n, b/n);
      System.out.println(phanSo);
    }

  }

  private static Long gcd(Long a, Long b) {
    while (b != 0) {
      Long t = b;
      b = a % b;
      a = t;
    }
    return a;
  }
}
class PhanSo {

  private Long tuSo;
  private Long mauSo;

  public PhanSo() {
  }

  public PhanSo(Long tuSo, Long mauSo) {
    this.tuSo = tuSo;
    this.mauSo = mauSo;
  }

  public Long getTuSo() {
    return tuSo;
  }

  public void setTuSo(Long tuSo) {
    this.tuSo = tuSo;
  }

  public Long getMauSo() {
    return mauSo;
  }

  public void setMauSo(Long mauSo) {
    this.mauSo = mauSo;
  }

  @Override
  public String toString() {
    return tuSo + "/" + mauSo;
  }
}

