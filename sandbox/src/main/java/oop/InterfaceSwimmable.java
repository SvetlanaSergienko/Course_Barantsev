package oop;

// Интерфейс — некий «пульт», который связывает две взаимодействующие друг с другом стороны.

// Например пульт от телефизора.
//Он связывает два объекта, человека и телевизор, и выполняет разные задачи: прибавить или убавить звук, переключить каналы, включить или выключить телевизор.
//
// Одной стороне (человеку) нужно обратиться к интерфейсу (нажать на кнопку пульта)
// , чтобы вторая сторона выполнила действие. Например, чтобы телевизор переключил канал на следующий.
// При этом пользователю не обязательно знать устройство телевизора и то, как внутри него реализован процесс смены канала.


//вместо слова class указываем слово interface.
public interface InterfaceSwimmable {

//  Мы создали интерфейс Swimmable — «умеющий плавать».
//  Нашего пульта, у которого есть одна «кнопка»: метод swim()  — «плыть».

//все интерфейсы пустые тк описывает поведение, а не реализует его. Все должны плавать и точка. А кто конкретно плавет это впрос к классам утка и тд
// Исключение методы по умолчанию (default method)

// Пульт просто предоставляет тебе кнопку для этого.

// Реализацция метода swim будет одинакова во всех классах

  public default void swim(){
    System.out.println("Плыви");
  }

//  Нужно реализовывать метод во всех классах, которые будут имплементировать Swimmable тк он не дефолтный
  public void eat();

//  Нужно реализовывать метод во всех классах, которые будут имплементировать Swimmable тк он не дефолтный
  public void run();

}
