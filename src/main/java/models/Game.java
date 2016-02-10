package models;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

import etc.CellState;
import etc.GameTurn;

@Entity
@Index
public class Game {
  public static final int NUM_CELLS = 9;
  
  @Id
  public Long id;
  
  public Key<User> player;
  public CellState[] board;
  public GameTurn turn;
  
  public Game() {
    this.board = new CellState[NUM_CELLS];
  }
}
