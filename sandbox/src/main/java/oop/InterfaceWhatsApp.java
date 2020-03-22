package oop;

public class InterfaceWhatsApp implements InterfaceMessenger {

  public void sendMessage() {

    System.out.println("Отправляем сообщение в InterfaceWhatsApp!");
  }

  public void getMessage() {
    System.out.println("Читаем сообщение в InterfaceWhatsApp!");
  }
}
