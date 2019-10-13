package ru.stqa.pft.sandbox;

/**
 * Класс Прямоугольника с конструктором  public Rectangle и методом area
 */

public class Rectangle {
  public double a;
  public double b;

//  Конструктор
  public Rectangle (double a, double b){
    this.a = a;
    this.b = b;
  }

  //  метод
  public double area (){
    return this.a * this.b;
  }
}
