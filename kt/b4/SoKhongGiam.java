package kt.b4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SoKhongGiam {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
    ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();

    ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
    ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
    int[] arr1 = new int[100000];
    int[] arr2 = new int[100000];
    for (Integer integer : list1) {
      arr1[integer]++;
    }
    for (Integer integer : list2) {
      arr2[integer]++;
    }
    List<Integer> list = new ArrayList<>();
    list.addAll(list1);
    list.addAll(list2);
    Set<Integer> set = new TreeSet<>(list);

    set.forEach(n -> {
      if (isPrint(n)) {
        System.out.println(n + " " + arr1[n] + " " + arr2[n]);
      }
    });
  }

  private static boolean isPrint(int n) {
    String nStr = String.valueOf(n);
    for (int i = 1; i < nStr.length(); i++) {
      if (nStr.charAt(i) < nStr.charAt(i - 1)) {
        return false;
      }
    }
    return true;
  }
}
