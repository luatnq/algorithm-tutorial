//package algorithm;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class MergeTwoList {
//
//  private final static Scanner scan = new Scanner(System.in);
//
//
//  public static void main(String[] args) {
//    //
//
//    Boolean[] listCheck2 = {false, false, false, false};
//    Boolean[] listCheck1 = {false, false, false, false};
//    System.out.println(mergeList(Arrays.asList(1,4,6,8), Arrays.asList(2,3,5,7), listCheck2, listCheck1));
//  }
//
//  public static List<Integer> mergeList(List<Integer> list1, List<Integer> list2,
//      Boolean[] listCheck2, Boolean[] listCheck1) {
////    list1.addAll(list2);
//    List<Integer> listResult = new ArrayList<>();
//    listResult.addAll(list1);
//    listResult.addAll(list2);
//
//    return listResult.stream().sorted().toList();
//  }
//
//}
