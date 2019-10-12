//Пакет
package ru.stqa.pft.sandbox;

//Класс
public class Mathematics {

  //	Метод или функция.
  //	Всегда после объявления стоят () для параметров
  public static void main(String[] args) {

//    sout - сокращенное сочетание клавишь System.out.println

//    Математика

    System.out.println(2 + 2);
    System.out.println(2 * 2);
    System.out.println(2 / 2);
    System.out.println(2 - 2);

//  По умолчанию используются целые числа. Для дробных нужно указать 1.0
    System.out.println(1 / 2);
    System.out.println(1.0 / 2);
    System.out.println(1 / 2.0);
    System.out.println(2.0 / 2);

    System.out.println("2" + "2");
    System.out.println("2" + 3);
    System.out.println(3 + "2");

    System.out.println(2 + 2 * 2);
    System.out.println((2 + 2) *2);

//    Конкотонация. прирете выполнения операций.
//    тк скобок нет то преобразует в строку
    System.out.println("2+2=" + 2 + 2);
    System.out.println(("2+2=" + (2 + 2)));

//    Переменные
    int l = 5;
    int s = l * l;
    System.out.println("Площадь квадрата со стороной " + l + "=" + (l * l));
    System.out.println("Площадь квадрата со стороной " + l + "=" + s);
  }

}