package oop;

//Использование интерфейса те имплементируем

//Класс InterfaceDuck «связывается» с интерфейсом InterfaceSwimmable при помощи ключевого слова implements
//можно для понятности перевести дословно: «публичный класс Duck реализует интерфейс Swimmable».

public class InterfaceDuck implements InterfaceSwimmable {


//  Обрати внимание: в нашем классе Duck прямо как в интерфейсе Swimmable есть метод swim()
//  Это обязательно должно быть.
//  В класса утка с implements «умеющий плавать» должен быть метод плыть тк утка должна уметь плавать

  public void swim() {
    System.out.println("Уточка, плыви!");
  }

  public void eat(){
    System.out.println("Уточка, ешь");
  }

  public void run(){
    System.out.println("Уточка, беги");
  }

  public static void main(String[] args) {

    InterfaceDuck duck = new InterfaceDuck();
    duck.swim();
    duck.eat();
  }

}
