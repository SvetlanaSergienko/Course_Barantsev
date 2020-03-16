package oop;

public class AbstractSedan extends AbstractMain {

//  Перед использованием абстрактного класс добавляем @Override
    @Override
    public void gas() {
      System.out.println("Седан газует!");
//      Первое и главное — экземпляр абстрактного класса создать нельзя:
//      Car car = new Car(); // Ошибка! Класс Car является абстрактным!

//    Если убрать абстрактный класс то у нас в программе появилась какая-то непонятная машина
//    — не грузовик, не гоночная, не седан, а вообще непонятно что. Та самая «просто машина»,
//    которых в природе не существует.
//
//    Тот же пример можно привести с животными.
//    Представь, если бы в твоей программе появились объекты Animal — «просто животное».
//    Какого оно вида, к какому семейству относится, какие у него характеристики — непонятно.
//    Было бы странно увидеть его в программе.
//    Никаких «просто животных» в природе не существует. Только собаки, кошки, лисы, кроты и другие.
//
//    Абстрактные классы избавляют нас от «просто объектов». Они дают нам базовое состояние и поведение.
//    Например, у всех машин должна быть модель, цвет и максимальная скорость, а еще они должны уметь газовать и тормозить.
//    Вот и все. Это — общая абстрактная схема, дальше ты уже сам проектируешь нужные тебе классы.
    }

    @Override
    public void brake() {
      System.out.println("Седан тормозит!");
    }
}
