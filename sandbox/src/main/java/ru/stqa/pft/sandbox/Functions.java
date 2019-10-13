package ru.stqa.pft.sandbox;

// Функции
public class Functions {

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

//  Если переменную объявить внутри функции то она будет работать только там.
//  Пример ниже с somebody.
//  Объявлять hello()

//  public static void hello(){
//    String somebody = "world";
//    System.out.println("Hello, " + somebody + "!");
//  }

//  Если нужно, что бы переменная из функции применялась везде
//  то прописать параметром (аргументом) функции public static void hello(String somebody)
//  и при объявлении так же внутри указывать значение - hello("World");

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