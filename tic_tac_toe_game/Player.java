package tic_tac_toe_game;

public class Player {
  public String name;
  public PlayingPiece playingPiece;

  Player(String name, PlayingPiece p) {
    this.name = name;
    this.playingPiece = p;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PlayingPiece getplayingPiece() {
    return playingPiece;
  }

  public void setPlayingPiece(PlayingPiece p) {
    this.playingPiece = p;
  }
}
