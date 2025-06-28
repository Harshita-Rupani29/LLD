package tic_tac_toe_game;

public class Main {
  public static void main(String[] args) {
    TicTacToeGame game = new TicTacToeGame();
    game.initializeGame(3);
    System.out.println("game winner is: " + game.startGame());

  }
}
