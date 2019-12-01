package oop;

//Консрукторы по сути создание всевозможных параметров для класс
//Например у персоны пармерты:
// 1. значения по умолчанию (рост, имя, метод говорить)
// 2. высота
// 3. высота и имя
// 4. имя

public class ConstructorsPerson {
    public int height = 180;
    public String name = "Default name";
    public void say (String name) {
        System.out.println("Привет, " + name);}

//Конструктор по умолчанию есть в люом классе, просто не виден. Ниже пример
public ConstructorsPerson () {}

//    Конструктор который передает высоту h
public ConstructorsPerson (int h) {
        height = h;
    }

public ConstructorsPerson (int h, String n)  {
        height = h;
        name = n;
}

    public ConstructorsPerson (String n)  {
        name = n;
    }

//    Конструкторов может быть сколько угодно


}
