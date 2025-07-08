package juspay;

import java.util.Stack;

public class two {
  public static void main(String[] args) {
    System.out.println(starFear("leet**cod*e"));
  }

  public static String starFear(String input) {
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < input.length(); i++) {
      char curr = input.charAt(i);

      if (curr == '*' && !st.isEmpty()) {
        st.pop();

      } else {
        st.push(curr);
      }

    }
    StringBuilder ans = new StringBuilder();
    while (!st.isEmpty()) {
      ans.append(st.pop());
    }
    return ans.reverse().toString();
  }
}
