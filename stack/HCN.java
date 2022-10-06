package stack;

import java.util.Stack;

public class HCN {

  public static void main(String[] args) {

  }

  public static void process(int a[], int n) {
    int R[] = new int[n], i = 0, j = 0;
    Stack<Integer> stack = new Stack<>();

    for (i = n - i; i > 0; i--) {
      while (!stack.empty() && a[i] >= stack.peek()) {
        stack.pop();
      }
      if (stack.empty()) R[i] = -1;
      else R[i] = stack.peek();
      stack.push(a[i]);
    }

    for (i = 0; i < n; i++) {
      System.out.println(R[i] + " ");
    }
    System.out.println(n);
  }
}
