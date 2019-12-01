package oop;

public class InheritanceMain {
    public static void main (String[] args){

        InheritancePerson vika = new InheritancePerson(150);
        System.out.println(vika.height);
        vika.say("Георгий");

        InheritancePerson dasha = new InheritancePerson(160, "Dasha");
        System.out.println(dasha.name + " ростом " + dasha.height);

        InheritancePerson anton = new InheritancePerson();
        System.out.println(anton.name + " " + anton.height);

        InheritancePerson den = new InheritancePerson("Den");
        System.out.println(den.name);
        System.out.println(" ");

        InheritanceStudent freshman = new InheritanceStudent(100, "Oleg", 2);
//      вывести метод tell из Student
        freshman.tell();

    }
}
