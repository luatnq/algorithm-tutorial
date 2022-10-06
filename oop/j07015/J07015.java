package oop.j07015;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class J07015 {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
    ArrayList<Integer> intList = (ArrayList<Integer>) ois.readObject();
    int[] arr = new int[10000];
    for (Integer integer : intList) {
      arr[integer]++;
    }
    for (int i = 0; i < 10000; i++) {
      if (isPrime(i))
        System.out.println(i + " " + arr[i]);
    }
  }

  public static boolean isPrime(int num) {
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) return false;
    }
    return num > 1;
  }
}