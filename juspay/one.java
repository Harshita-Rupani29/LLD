package juspay;

import java.util.PriorityQueue;
import java.util.Comparator; // Important to import Comparator

public class one {
  public static void main(String[] args) {
    System.out.println(Sort("AAAaaa")); // Expected: AAAaaa (freq 6, so just sorted by original char order)
                                        // Or: aaAAAA (if 'a' < 'A' in the final sort based on ASCII)
                                        // ASCII 'A' is 65, 'a' is 97. So 'A' comes before 'a'.
                                        // Thus, "AAAAaa" would be the sorted result
    System.out.println(Sort("cccaaa")); // Expected: aaaccc
    System.out.println(Sort("BbAa11Cc")); // Expected: 11ABCabc (or similar depending on ASCII order)
    System.out.println(Sort("topcoderOpen")); // Example with various chars
    // Freq: o:3, p:2, c:2, e:2, t:1, d:1, r:1, n:1
    // Chars: o (3), p (2), c (2), e (2), O (1), t (1), d (1), r (1), n (1)
    // Sorted: ooo (freq 3)
    // p, c, e (freq 2) - ASCII: c(99), e(101), p(112) -> ceep
    // O, t, d, r, n (freq 1) - ASCII: O(79), d(100), n(110), r(114), t(116) ->
    // Odenrt
    // Output: ooocceepOdenrt (this is just one way, if strict ASCII order is
    // followed)
  }

  public static String Sort(String input) {
    // Correct frequency calculation for all ASCII characters (0-255)
    int[] freq = new int[256];
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      freq[ch]++; // Use the character's ASCII value directly as the index
    }

    // PriorityQueue to sort Pairs based on criteria
    // Comparator implementation:
    // 1. Sort by frequency in descending order (b.freq - a.freq)
    // 2. If frequencies are equal, sort by character's ASCII value in ascending
    // order (a.place - b.place)
    PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
      @Override
      public int compare(Pair a, Pair b) {
        // Primary sorting: frequency in descending order (highest first)
        if (b.freq != a.freq) {
          return b.freq - a.freq;
        } else {
          // Secondary sorting: character's ASCII value (place) in ascending order
          // (alphabetical)
          // This means characters with lower ASCII values (e.g., 'A' before 'a', '1'
          // before 'A')
          // will come first if frequencies are the same.
          return b.place - a.place;
        }
      }
    });

    // Add characters with non-zero frequency to the priority queue
    for (int i = 0; i < freq.length; i++) {
      if (freq[i] != 0) {
        pq.add(new Pair(freq[i], i)); // 'i' is the ASCII value of the character
      }
    }

    StringBuilder res = new StringBuilder();
    // Extract characters from the priority queue and build the result string
    while (!pq.isEmpty()) {
      Pair currentPair = pq.poll();
      int frequency = currentPair.freq;
      char character = (char) currentPair.place; // Convert ASCII value back to char

      // Append the character 'frequency' times
      for (int i = 0; i < frequency; i++) {
        res.append(character);
      }
    }

    return res.toString();
  }

  // Static nested class for Pair remains the same, but 'place' now strictly means
  // ASCII value
  static class Pair {
    int freq; // Frequency of the character
    int place; // ASCII value of the character

    Pair(int freq, int place) {
      this.freq = freq;
      this.place = place;
    }
  }
}