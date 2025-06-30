package SnakeAndLadder;

public class Dice {
  int diceCount;
  int min = 1;
  int max = 6;

  Dice(int d) {
    this.diceCount = d;

  }

  public int roll() {
    int totalSum = 0;
    int d = 1;
    while (d <= diceCount) {
      totalSum += Math.floor(Math.random() * (max - min + 1)) + min;
      d++;
    }

    return totalSum;
  }
}
