package ru.stqa.pft.sandbox;

public class Point {

  public static int main (String[] args){

 double x1 = 5;
 double y1 = 4;

 double x2 = 3;
 double y2 = 7;

 point p1 =

    System.out.println("Расстояние между точками" + distance(x1,x2));

    //  функция формулы расстояние между точками
    public static double distance (Point p1, Point p2){
     int s;
     s = (int) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
     return s;
    }

  }
}
