package ru.stqa.pft.sandbox;

//позволяет вычислить расстояние между точками System.out.println(distance(x1, y1, x2, y2));

import static java.awt.geom.Point2D.distance;
import static ru.stqa.pft.sandbox.Point.mydistance;

/**
 * Класс Растояние между точками с конструктором  public Rectangle и методом area
 */

public class Main {

  private static Object Point;

  public static void main(String[] args) {

    double x1 = 4;
    double y1 = 7;

    double x2 = 8;
    double y2 = 8;

    double p1 = x2 - x1;
    double p2 = y2 - y1;

    System.out.println(distance(x1, y1, x2, y2));

    System.out.println(mydistance(p1, p2));


//    System.out.println("Расстояние между точкой 1" + p1 +  "и точкой 2" + p2 + "=" + distance(x1,y1,x2,y2));
//
////    функция формулы расстояние между точками
////  P1 P2 - ПАРАМЕТРЫ ИЛИ АРГУМЕНТЫ ФУНКЦИИ
////    Double - то что возвращает результат
//    public static double medistance(Point p1, Point p2){
//      return Math.sqrt(p1*p1+p2*p2);
//    }

    //  метод
//    public static double area(double l, double m) {
//      return Math.sqrt(l * l + m * m);
//    }
  }
}
