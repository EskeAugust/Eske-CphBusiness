float grey = 120;
float red = 0;
float blue = 0;
float green = 0;
int y = 0;
int moveY = 0;
int lightSwitch = 0;



void setup() {
  background(255);
  size(200, 550);
  fill(0);
  rect(10, 10, 180, 530);
  ellipseMode(CENTER);
  fill(grey);
  ellipse(100, 100, 150, 150);
  ellipse(100, 275, 150, 150);
  ellipse(100, 450, 150, 150);
  frameRate(1);
}

void draw() {
  if (lightSwitch < 1) {
    
    red = 255;
    fill(red, green, blue);
    ellipse(100, 100, 150, 150);
    
  } else if ((lightSwitch > 1) && (lightSwitch < 3)) {

    red = 255;
    green = 255;
    fill(red, green, blue);
    ellipse(100, 275, 150, 150);
  } else if (lightSwitch > 3) {

    red = 0;
    green = 255;
    fill(red, green, blue);
    ellipse(100, 450, 150, 150);

    fill(grey);
    ellipse(100, 100, 150, 150);
    ellipse(100, 275, 150, 150);
  }
  lightSwitch = lightSwitch + 1;
}
