package SnakeAndLadder;

public class Player {
  String id;
  int currentPosition;

  Player(String id) {
    this.id = id;

  }

  public Player(String id, int currentPosition) {
    this.id = id;
    this.currentPosition = currentPosition;
  }

  public void set(int c) {
    this.currentPosition = c;
  }

  public int get() {
    return currentPosition;
  }

}
