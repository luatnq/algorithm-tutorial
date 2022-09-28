package contest;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class TuKhacNhau {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    Set<String> set = new TreeSet<>();
    while (n-- > 0) {
      set.add(scan.next());
    }
    String firstName = scan.next();

    StringBuilder builder = new StringBuilder(firstName).append(" ");
    for (String str : set){
      if (!str.equals(firstName)){
        builder.append(str).append(" ");
      }
    }
    System.out.println(builder.toString().trim());
  }

}
