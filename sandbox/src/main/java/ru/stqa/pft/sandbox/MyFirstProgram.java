package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Alexsei");

//  Создание объекта тип s который берет переменные из класса Square. Значение подставляет конструктором.
    Square s = new Square(5);
//    s.area() - ссылка на метод
//    area(s) - ссылка на функцию (в этом же классе)
    System.out.println("Площадь квадрата со стороной " + s.l + "=" + s.area());

//  Создание объекта тип r который берет переменные из класса Rectangle. Значение подставляет конструктором.
    Rectangle r = new Rectangle(4,6);
//    r.area() - ссылка на метод
    System.out.println("Площадь прямоугольника со стронами " + r.a + " и " + r.b + " = " + r.area());

  }

  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");
  }

}