package ru.stqa.pft.sandbox;


public class Point {
  private static Object Point;

  public double x1;
  public double y1;

  public double x2;
  public double y2;

// public double p1=x2-x1;
// public double p2=y2-y1;


// public double x1 = 5;
// public double y1 = 4;
//
// public double x2 = 9;
// public double y2 = 7;
//
// public double p1=x2-x1;
// public double p2=y2-y1;

  // возвращает строку с описанием точки
  public String toString() {
    return "("+x1+";"+y1+")";
  }

  // выводит на экран описание точки
  public void printPoint() {
    System.out.print(this.toString());
  }


    //  Конструктор
  public void medistance(double x1, double y1, double x2, double y2){
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;


    }

    // конструктор, создающий точку с указанными координатами
    public void Point1(double x1, double y1){
      this.x1 = x1;
      this.y1 = y1;
    }

  // конструктор, создающий точку с указанными координатами
  public void Point2(double x2, double y2){
    this.x2 = x2;
    this.y2 = y2;
  }

  // метод вычисляющий расстояние между точками
  public double length(java.awt.Point p) {
    return Math.sqrt( Math.pow(p.x-x1,2) + Math.pow(p.y-y1,2) );
  }


//   метод (рабочий) вычисляет расстояние между точками
    public static double mydistance(double p1, double p2) {
    return Math.sqrt(p1 * p1 + p2 * p2);
    }

  }

