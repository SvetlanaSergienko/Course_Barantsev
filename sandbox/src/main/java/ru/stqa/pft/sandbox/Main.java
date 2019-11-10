package ru.stqa.pft.sandbox;

//позволяет вычислить расстояние между точками System.out.println(distance(x1, y1, x2, y2));

import static java.awt.geom.Point2D.distance;
import static ru.stqa.pft.sandbox.Point.mydistance;
import static ru.stqa.pft.sandbox.Point.mytwodistance;

/**
 * Класс Растояние между точками с конструктором  public Rectangle и методом area
 */

public class Main {

  public static void main(String[] args) {

    double x1 = 4;
    double y1 = 7;
    double x2 = 8;
    double y2 = 9;

    double a1 = x2 - x1;
    double b2 = y2 - y1;

    System.out.println(distance(x1, y1, x2, y2));

    System.out.println(mydistance(a1, b2));

    Point p1 = new Point(x1, y1);
    Point p2 = new Point(x2, y2);

    System.out.println("p1" + p1 + ", p2" + p2);
    System.out.println("Расстояние между точками p1 и p2 = " + mytwodistance(p1, p2));
  }
}
