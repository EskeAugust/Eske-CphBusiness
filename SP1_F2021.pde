int size = 40;
int[][] grid = new int[25][25];

Player player;
Enemy[] enemy = new Enemy[4];
Food[] food = new Food[4];

void setup()
{
  size(1001, 1001);
  textSize(20);
  frameRate(5); // Difficulity level 
  player = new Player(3, 20);
  for (int i = 0; i < enemy.length; i++)
  {
    enemy[i] = new Enemy((int)random(0, 24), (int)random(0, 24), player);
  }
  for (int i = 0; i < food.length; i++)
  {
    food[i] = new Food((int)random(0, 24), (int)random(0, 24), player);
  }
}

void draw()
{
  clearBoard();
  updateFood();
  updateEnemies();
  updatePlayer();
  drawBoard();
  resolveCollisions();
}

void clearBoard()
{
  for (int x = 0; x < grid.length; x++)
  {
    for (int y = 0; y < grid[0].length; y++)
    {
      grid[x][y] = 0;
    }
  }
}

void drawBoard()
{
  for (int x = 0; x < grid.length; x++)
  {
    for (int y = 0; y < grid[0].length; y++)
    {
      fill(getColorFromType(grid[x][y]));

      rect(x * size, y * size, size, size);
    }
  }
}

void resolveCollisions()
{
  for (int i = 0; i < enemy.length; i++)
  {
    if (grid[enemy[i].x] == grid[player.x] && grid[enemy[i].y] == grid[player.y])
    {
      player.takeDamage();
      if (player.health <= 0)
      {
        background(0);
        textSize(50);
        strokeWeight(5);
        fill(255, 0, 0);
        text("Game over! \n Your score is: " +player.score, 200, 200);
        noLoop();
      }
    }
  }
  for (int i = 0; i < food.length; i++)
  {
    if (grid[food[i].x] == grid[player.x] && grid[food[i].y] == grid[player.y] && food[i].type != 0)
    {
      player.increaseScore();
      food[i] = new Food((int)random(0, 24), (int)random(0, 24), player);
    } else if (grid[food[i].x] == grid[player.x] && grid[food[i].y] == grid[player.y] && food[i].type == 0)
    {
      player.score = player.score;
    }
    player.displayHealth();
    player.displayScore();
  }
}

void updatePlayer()
{
  grid[player.x][player.y] = player.type;
}

void updateEnemies()
{
  if (frameCount % 40 == 0);
  {
    for (int i = 0; i < enemy.length; i++)
    {
      grid[enemy[i].x][enemy[i].y] = enemy[i].type;
      enemy[i].moveTowardsPlayer();
    }
  }
}

void updateFood()
{
  if (frameCount%40 == 0);
  {
  for (int i = 0; i < food.length; i++)
  {
    grid[food[i].x][food[i].y] = food[i].type;
    food[i].moveAwayFromPlayer();
    }
  }
}

color getColorFromType(int type) 
{
  color c = color(255);

  switch(type)
  {
  case 0: 
    c = color(0, 120, 120);
    break;
  case 1: 
    c = color(252, 100, 100);
    break;
  case 2: 
    c = color(100, 255, 100);
    break;
  case 3: 
    c = color(255, 255, 140);
    break;
  case 4: 
    c = color (0, 255, 255);
    break;
  }    

  return c;
}

void keyPressed()
{
  if (key == 'w' && player.y > 0)
  {
    player.y--;
  }
  if (key == 'a' && player.x > 0)
  {
    player.x--;
  }
  if (key == 's' && player.y < 24)
  {
    player.y++;
  }
  if (key == 'd' && player.x < 24)
  {
    player.x++;
  }
}
