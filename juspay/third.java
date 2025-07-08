package juspay;

import java.util.Arrays; // Used for sorting

public class third {
  public static void main(String[] args) {
    // Test cases:
    System.out.println(sort(new int[] { 100, 4, 200, 1, 3, 2 })); // Expected: 4 (1,2,3,4)
    System.out.println(sort(new int[] { 1, 2, 3, 4, 5 })); // Expected: 5
    System.out.println(sort(new int[] { 5, 4, 3, 2, 1 })); // Expected: 5
    System.out.println(sort(new int[] { 1, 3, 5, 7, 9 })); // Expected: 1
    System.out.println(sort(new int[] { 1, 2, 2, 3, 4 })); // Expected: 4 (1,2,3,4 - handles duplicates)
    System.out.println(sort(new int[] {})); // Expected: 0 for empty array
    System.out.println(sort(new int[] { 7 })); // Expected: 1 for single element
  }

  public static int sort(int[] ele) {
    // Handle empty array edge case
    if (ele.length == 0) {
      return 0;
    }

    // Step 1: Sort the array
    Arrays.sort(ele); // This is crucial for the current logic

    int maxLen = 0; // Renamed 'ans' to 'maxLen' for clarity
    int currentLen = 1; // Renamed 'cnt' to 'currentLen', starts at 1 for the first element

    // Iterate through the sorted array
    for (int i = 1; i < ele.length; i++) { // Start from i=1 to compare with previous
      int prev = ele[i - 1];
      int curr = ele[i];

      if (curr == prev) {
        // If current number is a duplicate of the previous, it doesn't break the
        // sequence
        // and doesn't extend it either. Just continue.
        continue;
      } else if (curr == prev + 1) {
        // If current number is exactly one greater than the previous, extend the
        // sequence
        currentLen++;
      } else {
        // If it's neither a duplicate nor consecutive, the sequence is broken
        // Update maxLen with the length of the completed sequence
        maxLen = Math.max(maxLen, currentLen);
        // Reset currentLen for the new sequence starting with 'curr'
        currentLen = 1;
      }
    }
    // After the loop, the last sequence's length needs to be compared with maxLen
    maxLen = Math.max(maxLen, currentLen);

    return maxLen;
  }
}