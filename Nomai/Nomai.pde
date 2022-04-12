int x,y,a,b;
int MODE;
void setup(){
   size(800,800);
   MODE = 3;
   x = width/2;
   y = height/2;
}
void draw(){
   background(0);
   x = change(x);
   y = change(y);
   avatar(x,y);
   if (mousePressed){
     a = mouseX;
     b = mouseY;
   }
   avatar(a,b);
}
int change(int value){
  /**
   mode 1: return a random location on the screen.
   mode 2: change each by +1, 0, or -1 randomly
   mode 3: change by +1 each, but if they hit the end of the screen ,
         wrap back around to the other end of the screen
  */

  switch(MODE){
   case 1:
     return (int) random(width);
   case 2:
     return value + (int) random(3)-1;
   case 3:
     value++;
     if (value > width){
       return 0;
     }
     return value;
   default:
     return 0;
  }
}
void avatar(int x, int y){
  noStroke();
  fill(150);
  circle(x,y-7,142);
  fill(0);
  circle(x,y-7,120);
  fill(255);
  quad(x-10,y-10,x-20,y-10,x-20,y-70,x-10,y-70);
  quad(x+10,y-10,x+20,y-10,x+20,y-70,x+10,y-70);
  quad(x+36,y-1,x+29,y+6,x+53,y+30,x+60,y+23);
  quad(x-36,y-1,x-29,y+6,x-53,y+30,x-60,y+23);
  quad(x+18,y+17,x+11,y+24,x+35,y+48,x+42,y+41);
  quad(x-18,y+17,x-11,y+24,x-35,y+48,x-42,y+41);
  fill(0);
  quad(x+10,y-10,x-10,y-10,x-10,y-80,x+10,y-80);
  quad(x-29,y+6,x-60,y+37,x-49,y+48,x-18,y+17);
  quad(x+29,y+6,x+60,y+37,x+49,y+48,x+18,y+17);
  quad(x-39,y-16,x-63,y-40,x-52,y-57,x-28,y-27);
  quad(x+39,y-16,x+63,y-40,x+52,y-57,x+28,y-27);
  quad(x+10,y-10,x-10,y-10,x-10,y+65,x+10,y+65);
  fill(255);
  quad(x+37,y,x,y+37,x-37,y,x,y-37);
  quad(x+30,y-15,x,y+15,x-30,y-15,x,y-45);
  fill(175);
  quad(x+30,y,x,y+30,x-30,y,x,y-30);
  fill(127,0,255);
  quad(x-25,y,x-15,y+10,x-5,y,x-15,y-10);
  quad(x,y-25,x+10,y-15,x,y-5,x-10,y-15);
  quad(x+25,y,x+15,y+10,x+5,y,x+15,y-10);
  fill(255);
  quad(x-20,y,x-15,y+5,x-10,y,x-15,y-5);
  quad(x,y-20,x+5,y-15,x,y-10,x-5,y-15);
  quad(x+20,y,x+15,y+5,x+10,y,x+15,y-5);
  fill(225);
  triangle(x,y+5,x+12.5,y+17.5,x-12.5,y+17.5);
  quad(x+12.5,y+17,x-12.5,y+17,x-5,y+45,x+5,y+45);
  fill(175);
  quad(x+3,y,x+3,y+32,x-3,y+32,x-3,y);
}
