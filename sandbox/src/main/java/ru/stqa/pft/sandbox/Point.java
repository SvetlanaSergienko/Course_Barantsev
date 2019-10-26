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

    //  Конструктор
  public void distance(double x1, double y1, double x2, double y2){
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
  public void Point2(double a, double b){
    this.x2 = a;
    this.y2 = b;
  }


    //  метод
    public void area() {
     Math.sqrt((this.x2 - this.x1) * (this.x2 - this.x1) + (this.y2 - this.y1) * (this.y2 - this.y1));
    }

  }

