package oop;

// Абстрактный класс - это максимально абстрактная, о-о-о-чень приблизительная «заготовка» для группы будущих классов.
// Эту заготовку нельзя использовать в готовом виде — слишком «сырая». Но она описывает некое общее состояние и поведение,
// которым будут обладать будущие классы — наследники абстрактного класса.

// Данный класс прежде всего, он максимально абстрактно описывает нужную нам сущность — автомобиль.
// Слово abstract находится здесь недаром.
// В мире не существует «просто машин». Есть грузовики, гоночные автомобили, седаны, купе, внедорожники.
//Наш абстрактный класс — это просто «чертеж», по которому мы позже будем создавать классы-автомобили.

public abstract class AbstractMain {

  private String model;
  private String color;
  private int maxSpeed;

  public abstract void gas();

  public abstract void brake();

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }
}

