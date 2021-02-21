class Food
{
  int x; 
  int y; 
  int type = 2;
  Player player;

  Food(int x, int y, Player player)
  {
    this.x = x;
    this.y = y;
    this.player = player;
  }

  void moveAwayFromPlayer()
  {
    int xDistance = Math.abs(player.x - x);
    int yDistance = Math.abs(player.y - y);
    float prob = 0.25;
    float num = random(1);
    if (prob < num)
    {

      if (xDistance >= yDistance && player.x > x && x > 0)
      {
        x--;
      } else if (xDistance >= yDistance && player.x < x && x < 24)
      {
        x++;
      } else if (yDistance >= xDistance && player.y > y && y > 0)
      {
        y--;
      } else if (yDistance >= xDistance && player.y < y && y < 24)
        y++;
    } else
    {
      moveRandomFood();
    }
  }
  
  void moveRandomFood()
  {
    float prob2 = random(1);
    if (prob2 < 0.25 && player.x > x && x > 0)
    {
      x++;
    } else if (prob2 >= 0.25 && prob2 <= 0.5 && player.x < x && x < 24)
    {
      x--;
    } else if (prob2 >= 0.5 && prob2 <= 0.75 && player.y > y && y > 0)
    {
      y++;
    } else if (prob2 > 0.75 && player.y < y && y < 24)
    {
      y--;
    }
  }
}
   
