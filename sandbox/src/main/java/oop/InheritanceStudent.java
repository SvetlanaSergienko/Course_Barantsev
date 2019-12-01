package oop;

// extends - наследование все у классе InheritancePerson
// класс InheritanceStudent стал наслеником класса InheritancePerson
// если создать еще один класс который наследник InheritanceStudent, то он стант и наследником InheritancePerson

public class InheritanceStudent extends InheritancePerson {
    int course = 1;

//    Конструктор в классе с наследованием
//    все переменные и внутри класса и из наследника записываются в ()
    public InheritanceStudent (int height, String name, int course){
//    Перменные из наследника height, name хзаписываем через super, те в главный конструктор
        super(height, name);
//        перменные этого класса записываем как this и название в классе = названию в конструкторе
        this.course=course;
    }


//  super.name - переменная из основного класса InheritancePerson
//    на переменные и методы основного класса ссылаться super.
    void tell(){
        System.out.println(super.name);
        System.out.println(super.height);
        System.out.println(course);
    }
}
