package juspay;

import java.util.Arrays;

public class fourth {
  public static void main(String[] args) {
    System.out.println(vampire(new int[] { 0, 9, 3, 2, 1, 2 }));
    System.out.println(vampire(new int[] { 10, 5, 20, 15, 30 })); // Damon sum = 80. Stephan needs > 80.
    System.out.println(vampire(new int[] { 1, 1, 1, 1, 1 }));
  }

  public static int vampire(int[] ele) {
    int ans = 0;
    Arrays.sort(ele);
    int sum = 0;
    for (int i = ele.length - 1; i >= 0; i--) {
      sum += ele[i];
    }
    for (int i = ele.length - 1; i >= 0; i--) {
      if (ans > sum - ans) {
        break;
      }
      if (ele[i] != 0) {
        ans += ele[i];
      }
    }

    return ans;
  }
}
