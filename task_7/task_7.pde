int input = 50;
for (int i = 0; i <= input; i++) {
   println(i);
   if (i == input/2-1) {
    println("Half");
    i = input/2;
  }
  if (i == 5) {
    println("Six");
    i = 6;
  }
}
