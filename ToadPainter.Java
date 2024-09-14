import org.code.neighborhood.*;
public class ToadPainter extends MuralPainter {
// used the different methods and adds them here to create toad
public void drawToad() {
  drawOutline();
  drawFace();
  resetPosition();
  drawRed();
  drawWhite();
  
  
  
}
 // draws the black outline of toad 
public void drawOutline() {
 move(); 
 move(); 
 move(); 
 move(); 
 move(); 
turnRight();
 move(); 
 move(); 
 move(); 
turnLeft();
paintStreak("black", 5);
turnRight();
move();
paintStreak("black", 1);
turnLeft();
move();
paintStreak("black", 1);
turnRight();
move();
paintStreak("black", 1);
turnLeft();
move();
turnRight();
paintStreak("black", 3);
turnRight();
move();
paintStreak("black", 2);
turnRight();
move();
turnLeft();
paintStreak("black", 2);
turnLeft();
paintStreak("black", 3);
turnRight();
move();
turnRight();
move();
move();
move();
turnLeft();
paintStreak("black", 2);
turnLeft(); 
paintStreak("black", 3);
turnRight();
move();
turnRight();
move();
move();
move();
turnLeft();
paintStreak("black", 2);
turnLeft();
move();
turnRight();
paintStreak("black", 2);
turnRight();
move();
paintStreak("black", 3);
turnRight();
move();
paintStreak("black", 1);
turnLeft();
move();
paintStreak("black", 1);
turnRight();
move();
paintStreak("black", 1);
turnLeft();
move();
paintStreak("black", 1);
moveToCorner();
moveToCorner();
turnRight();
move();
move();
move();
turnRight();
move();
move();
move();
move();
turnRight();
turnRight();
paintStreak("black", 2);
turnRight();
move();
paintStreak("black", 1);
turnLeft();
move();
turnRight();
paintStreak("black", 7);
turnRight();
move();
paintStreak("black", 1);
turnLeft();
move();
turnRight();
paintStreak("black", 2);
}
// this colors the face the skin tone of toad
public void drawFace() {
turnRight();
move();
if (hasPaint()){
paintStreak("blanchedAlmond", 2);
move();  
} else{
paintStreak("blanchedAlmond", 2);
move(); 
} 
paintStreak("blanchedAlmond", 2);
move();
paintStreak("blanchedAlmond", 2);
turnRight();
move();
turnRight();
paintStreak("blanchedAlmond", 3);
move();
paintStreak("blanchedAlmond", 2);
move();
paintStreak("blanchedAlmond", 2);
turnLeft();
move();
turnLeft();
move();
setPaint(9);
while(hasPaint()){
  paintToEmpty("blanchedAlmond");
turnRight();
move();
}
turnRight();
move();
move();
setPaint(7);
while(hasPaint()){
paintToEmpty("blanchedAlmond");
turnAround();
}
}
  // this colors the red mushroom part of toad
public void drawRed() {
 move(); 
 move(); 
 move(); 
 move(); 
turnRight();
 move(); 
 move(); 
 move();
 move();
 setPaint(5);
 while(hasPaint()){
paintToEmpty("fireBrick");
turnLeft();
move();
turnLeft();
move();
}
setPaint(5);
 while(hasPaint()){
paintToEmpty("fireBrick");
turnRight();
move();
turnRight();
move();
}
setPaint(5);
 while(hasPaint()){
paintToEmpty("fireBrick");
turnLeft();
move();
turnLeft();
move();
}
setPaint(3);
 while(hasPaint()){
paintToEmpty("fireBrick");
move();
move();
turnRight();
move();
turnRight();
move();
move();
move();
move();
}
setPaint(2);
 while(hasPaint()){
paintToEmpty("fireBrick");
turnLeft();
move();
turnLeft();
move();
}
setPaint(3);
 while(hasPaint()){
paintToEmpty("fireBrick");
move();
turnRight();
move();
turnRight();
move();
}
setPaint(4);
 while(hasPaint()){
paintToEmpty("fireBrick");
turnLeft();
move();
turnLeft();
}
setPaint(3);
 while(hasPaint()){
paintToEmpty("fireBrick");
turnRight();
move();
turnRight();
move();
move();
move();
}
setPaint(1);
paintToEmpty("fireBrick");
turnRight();
while(canMove()){
  move();
}
turnRight();
move();
turnRight();
move();
setPaint(2);
paintToEmpty("fireBrick");
turnLeft();
move();
turnLeft();
setPaint(3);
paintToEmpty("fireBrick");
turnRight();
move();
turnRight();
move();
}
// this colors the white mushroom part of toad 
public void drawWhite() {
 setPaint(3);
paintToEmpty("white");
turnLeft();
move();
turnLeft();
move();
setPaint(2);
paintToEmpty("white");
turnRight();
move();
turnRight();
move();
move();
setPaint(1);
paintToEmpty("white");
move();
move();
turnRight();
move();
turnLeft();
move();
move();
setPaint(1);
paintToEmpty("white");
turnLeft();
move();
setPaint(2);
paintToEmpty("white");
turnLeft();
move();
turnLeft();
move();
setPaint(2);
paintToEmpty("white");
turnRight();
move();
turnRight();
move();
setPaint(2);
paintToEmpty("white");
turnRight();
move();
move();
move();
move();
turnRight();
move();
move();
move();
setPaint(1);
paintToEmpty("white");
turnLeft();
move();
turnRight();
setPaint(2);
paintToEmpty("white");
  

}



  






















}