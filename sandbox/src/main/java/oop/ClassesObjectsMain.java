package oop;

//import com.oop.ClassesObjectsPerson;

// Почему то работает только если в main вставлять и в одной папке
//private, public - модификатор доступа. private - доступен в рамках класса, public - везде
// класс main всегда должен быть. Он главный класс в котором все классы связаны.
public class ClassesObjectsMain {
    public static void main (String[] ars) {

//    в java переменные это поля, а функции в классе это методы

//    Создание объекта Vitya класса ClassesObjectsPerson
        ClassesObjectsPerson vitya = new ClassesObjectsPerson();
//     Присвоить значение поля height объекта vity 120
        vitya.height=120;
//     Вывести на экран значение поля height объекта vitya
        System.out.println(vitya.height);
//      Вызвать метод say и присвоить name=George
        vitya.say("George");

//    Создание объекта dima класса ClassesObjectsPerson
        ClassesObjectsPerson dima = new ClassesObjectsPerson();
//     Вывести на экран значение поля height объекта dima
        System.out.println(dima.height);



    }
}
