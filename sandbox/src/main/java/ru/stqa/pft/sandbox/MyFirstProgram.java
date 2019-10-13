package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Alexsei");

    double len = 5;
    System.out.println("Площадь квадрата со стороной " + len + "=" + area(len));

    double a = 4;
    double b = 6;
    System.out.println("Площадь прямоугольника со стронами " + a + " и " + b + " = " + area(a,b));

  }

  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");
  }

//  функция формулы площади квадрата
  public static double area(double l){
    return l*l;
  }
//  функция формулы площади прямоугольника
  public static double area (double a, double b){
    return a*b;
  }

}