package oop;

public class InheritancePerson {
    public int height = 180;
    public String name = "Default name";
    public void say (String name){
        System.out.println("Привет, " + name);
    }

public InheritancePerson () {}

public InheritancePerson (int h){
        height=h;
    }

public InheritancePerson (int h, String n) {
        height=h;
        name=n;
    }

public InheritancePerson (String n) {
        name=n;
    }

}
