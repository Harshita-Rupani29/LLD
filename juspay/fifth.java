package juspay;

import java.util.HashMap;

public class fifth {
  public static void main(String[] args) {
    System.out.println(toDelete(new int[] { 1, 3, 4, 3, 3, 3 }));
    // Additional test cases
    System.out.println(toDelete(new int[] { 1, 2, 3, 4, 5 })); // Expected: 0 (all unique)
    System.out.println(toDelete(new int[] { 1, 1, 1, 1 })); // Expected: 3 (keep 1, delete 3)
    System.out.println(toDelete(new int[] { 5, 5, 5, 1, 1 })); // Expected: 3 (2 for 5, 1 for 1)
    System.out.println(toDelete(new int[] {})); // Expected: 0 (empty input)
    System.out.println(toDelete(new int[] { 7 }));
  }

  public static int toDelete(int[] mails) {
    int ans = 0;
    HashMap<Integer, Integer> m = new HashMap<>();
    for (int i = 0; i < mails.length; i++) {
      m.put(mails[i], m.getOrDefault(mails[i], 0) + 1);
    }
    for (int k : m.keySet()) {
      ans += m.get(k) - 1;
    }
    return ans;
  }
}
