package oop;

public class InterfaceViber implements InterfaceMessenger {

  public void sendMessage() {

    System.out.println("Отправляем сообщение в InterfaceViber!");
  }

  public void getMessage() {
    System.out.println("Читаем сообщение в InterfaceViber!");
  }
}
