//package contest;
//
//<<<<<<< HEAD
//import java.util.ArrayList;
//import java.util.List;
//=======
//import java.util.Arrays;
//>>>>>>> c89e2921e69cad2aab11e8e24ab407d7a2958684
//import java.util.Scanner;
//import java.util.Stack;
//
//public class NgoacDung {
//
//  public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//<<<<<<< HEAD
//
//    int n = scan.nextInt(), index = 0;
//    List<String> list = new ArrayList<>();
//    scan.nextLine();
//    while (n-- > 0) {
//      String input = scan.next();
//
//      list.add(handle(input).trim());
//    }
//
//    list.forEach(System.out::println);
//  }
//
//  private static String handle(String input) {
//    Stack<Character> stack = new Stack<>();
//    for (int i = 0; i < input.length(); i++) {
//
//      Character charChecking = input.charAt(i);
//      if (charChecking == '(' || charChecking == '{' || charChecking == '[') {
//        stack.push(charChecking);
//      } else if (charChecking == ')' && !stack.empty() && stack.pop() != '(') {
//        return "NO";
//      } else if (charChecking == '}' && !stack.empty() && stack.pop() != '{') {
//        return "NO";
//      } else if (charChecking == ']' && !stack.empty() && stack.pop() != '[') {
//        return "NO";
//      }
//    }
//    return "YES";
//  }
//
//
//=======
//    int n = scan.nextInt();
//    String[] strArr = new String[n];
//    scan.nextLine();
//    for (int i = 0; i < n; i++) {
//      strArr[i] = scan.nextLine();
//    }
//    int i = 0;
//    while (n-- > 0) {
//      System.out.println(handle(strArr[i++]));
//    }
//  }
//
//  private static int handle(String input) {
//
//    Stack<Character> stack = new Stack<>();
//    if (input.matches("\\s+")) return input.length();
//    int result = 0, index = 0;
//    int[] resultArr = new int[input.length()];
//
//    for (int i = 0; i < input.length(); i++) {
//      if (input.charAt(i) == '(') {
//        stack.push('(');
//      } else if (input.charAt(i) == ')' && !stack.isEmpty() && stack.pop() == '(') {
//        result++;
//      } else {
//        resultArr[index++] = result;
//        result = 0;
//      }
//    }
//
//    return Arrays.stream(resultArr).max().getAsInt() * 2;
//
//  }
//>>>>>>> c89e2921e69cad2aab11e8e24ab407d7a2958684
//}
