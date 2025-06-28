package tic_tac_toe_game;

import java.util.ArrayList;
import java.util.List;

import tic_tac_toe_game.PlayingPiece;

public class Board {
  int size;
  public PlayingPiece[][] board;

  Board(int n) {
    this.size = n;
    board = new PlayingPiece[n][n];
  }

  public boolean addPiece(int r, int c, PlayingPiece p) {
    if (board[r][c] != null)
      return false;
    board[r][c] = p;
    return true;
  }

  public List<Pair<Integer, Integer>> getFreeCells() {
    List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (board[i][j] == null) {
          Pair<Integer, Integer> rowColumn = new Pair<>(i, j);
          freeCells.add(rowColumn);
        }
      }
    }

    return freeCells;
  }

  public void printBoard() {

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (board[i][j] != null) {
          System.out.print(board[i][j].pieceType.name() + "   ");
        } else {
          System.out.print("    ");

        }
        System.out.print(" | ");
      }
      System.out.println();

    }
  }

}
