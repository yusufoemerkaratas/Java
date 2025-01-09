package Lektion16.Ubung1;

public class Brett
{
  boolean[][] brett = new boolean[8][8];
  
  public Brett()
  {

  }
  public Brett kombiniere(Brett other) {
    Brett neuesBrett = new Brett();
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (this.brett[i][j] || other.brett[i][j]) {
          neuesBrett.brett[i][j] = true;
        }
      }
    }
    return neuesBrett;
  }

  public void markiereFeld(int x, int y)
  {
    brett[x][y] = true;
  }
  
  public boolean gibFeld(int x, int y)
  {
    return brett[x][y];
  }
  
}
