package oop;

//Интерфейс описывает поведение, которым должны обладать классы, реализующие этот интерфейс.
// «Поведение» — это совокупность методов.
//
//Если мы хотим создать несколько мессенджеров, проще всего сделать это,
// создав интерфейс InterfaceMessenger.
// Что должен уметь любой мессенджер? В упрощенном виде, принимать и отправлять сообщения.

public interface InterfaceMessenger {

  public void sendMessage();

  public void getMessage();

}
