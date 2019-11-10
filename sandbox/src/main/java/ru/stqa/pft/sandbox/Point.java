package ru.stqa.pft.sandbox;


public class Point {
  private static Object Point;

  public double x1;
  public double y1;

  public double x2;
  public double y2;

  public Point(double x, double y) {
    this.x1 = x;
    this.y1 = y;
    this.x2 = x;
    this.y2 = y;
  }

  // возвращает строку с описанием точки
  public String toString() {
    return "(" + x1 + ";" + y1 + ")";
  }

  // выводит на экран описание точки
  public void printPoint() {
    System.out.print(this.toString());
  }

  //  Конструктор
  public void medistance(double x1, double y1, double x2, double y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  // метод вычисляющий расстояние между точками через
  public double length(java.awt.Point p) {
    return Math.sqrt(Math.pow(p.x - x1, 2) + Math.pow(p.y - y1, 2));
  }

  //   метод (рабочий) вычисляет расстояние между точками через a расстояние между х2-х1
  public static double mydistance(double a1, double b2) {
    return Math.sqrt(a1 * a1 + b2 * b2);
  }

  //   метод ( рабочий) вычисляет расстояние между точками
  public static double mytwodistance(Point p1, Point p2) {
    return Math.sqrt(Math.pow(p2.x2 - p1.x1, 2) + Math.pow(p2.y2 - p1.y1, 2));
  }

}