class Player
{
  int x; 
  int y; 
  int type = 3; 
  int health; 
  int score;

  Player(int x, int y)
  {
    this.x = x;
    this.y = y;
    health = 100;
    score = 0;
  }

  void displayHealth()
  {
    fill(0);
    textSize(25);
    text("Remaining health " +health, width-350, height-(height-100));
  }
  
  void displayScore()
  {
   fill(0);
   text("Current score " + score, width-350, height - (height-150));
  }

  void takeDamage()
  {
    health--;
  }
  
  void increaseScore()
  {
   score++;    
  }
}
