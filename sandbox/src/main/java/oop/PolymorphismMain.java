package oop;

// Полиморфизм.Мы может создать один метод в основном классе Shape и переопределить их в других

public class PolymorphismMain {
    public static void main(String[] args) {
//  Создаем массив  PolymorphismShape из элементов круг, квадрат, треугольник
      PolymorphismShape[] arr = new PolymorphismShape[]{new PolymorphismCircle(), new PolymorphismSquare(), new PolymorphismTriangle()};
//  arr.length - т.е. до конца количества наших переменных
     for (int i = 0; i < arr.length; i++)
//       берем из массива arr элемент i по методу draw
         arr[i].draw();
    }
}