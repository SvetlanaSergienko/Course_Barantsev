package ru.stqa.pft.sandbox;

/**
 * Класс Растояние между точками с конструктором  public Rectangle и методом area
 */

public class Distance {
  public double x1;
  public double y1;
  public double x2;
  public double y2;


  //  Конструктор
  public Distance (double x1, double y1, double x2, double y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;

  }

  //  метод
  public double area (){
    return this.a * this.b;
    Math.sqrt((this.x2-this.x1)*(this.x2-this.x1)+(this.y2-this.y1)*(this.y2-this.y1));
  }

}
