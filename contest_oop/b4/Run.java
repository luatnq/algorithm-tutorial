package contest_oop.b4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Run {

  public static void main(String[] args) throws FileNotFoundException {

    File file = new File("DANHSACH.in");
    Scanner scan = new Scanner(file);

    List<FullName> list = new ArrayList<>();
    while (scan.hasNextLine()) {
      String[] nameArr = scan.nextLine().trim().toLowerCase().split("\\s+");
      String firstName = handleWord(nameArr[0]);
      String lastName = handleWord(nameArr[nameArr.length - 1]);

      StringBuilder builder = new StringBuilder();
      for (int i = 1; i < nameArr.length - 1; i++) {
        builder.append(handleWord(nameArr[i])).append(" ");
      }
      String middleName = builder.toString().trim();

      list.add(new FullName(firstName, middleName, lastName));
    }

    sort(list);
    list.forEach(System.out::println);

  }

  private static void sort(List<FullName> fullNames) {

    Collections.sort(fullNames, new Comparator<FullName>() {
      @Override
      public int compare(FullName o1, FullName o2) {
        int compareLastName = o1.getLastName().compareTo(o2.getLastName());
        if (compareLastName == 0) {
          int compareFirstName = o1.getFirstName().compareTo(o2.getFirstName());

          if (compareFirstName == 0) {
            return o1.getMiddleName().compareTo(o2.getMiddleName());
          }
        }
        return compareLastName;
      }
    });
  }

  private static String handleWord(String word) {
    StringBuilder builder = new StringBuilder(String.valueOf(word.charAt(0)).toUpperCase()).append(word.substring(1));
    return builder.toString().trim();
  }
}
