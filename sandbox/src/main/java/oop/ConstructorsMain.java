package oop;

//import com.oop.ConstructorsPerson;

public class ConstructorsMain {
    public static void main(String[] args) {
    //  При создание объекта Vitya класса ConstructorsPerson в () нужно указать переменные (поля) те высоту
//  если () те не указать переменные то будет конструктор по умолчанию, те 180
    ConstructorsPerson vitya = new ConstructorsPerson(120);
            System.out.println(vitya.height);
            vitya.say("George");

    ConstructorsPerson dima = new ConstructorsPerson();
            System.out.println(dima.height + " " + dima.name);

    ConstructorsPerson anton = new ConstructorsPerson(150, "Anton");
            System.out.println(anton.name + " ростом " + anton.height);

    ConstructorsPerson masha = new ConstructorsPerson( "Masha");
            System.out.println(masha.name);

}
}
