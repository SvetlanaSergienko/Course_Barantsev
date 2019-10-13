package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Alexsei");

//  Создание объекта тип s который берет переменные из класса Square. Значение подставляет конструктором.
    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + "=" + area(s));

//  Создание объекта тип r который берет переменные из класса Rectangle. Значение подставляет конструктором.
    Rectangle r = new Rectangle(4,6);
    System.out.println("Площадь прямоугольника со стронами " + r.a + " и " + r.b + " = " + area(r));

  }

  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");
  }

//  функция формулы площади квадрата. Ссылка на отдельный класс с переменной a
  public static double area(Square s){
    return s.l * s.l;
  }
//  функция формулы площади прямоугольника. Ссылка на отдельный класс с переменной a b
  public static double area (Rectangle r){
    return r.a * r.b;
  }

}