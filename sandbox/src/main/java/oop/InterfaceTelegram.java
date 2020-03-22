package oop;

//public class InterfaceTelegram implements InterfaceMessenger, Application
public class InterfaceTelegram implements InterfaceMessenger, InterfaceApplication {

  public void sendMessage() {

    System.out.println("Отправляем сообщение в InterfaceTelegram!");
  }

  public void getMessage() {
    System.out.println("Читаем сообщение в InterfaceTelegram!");
  }

  public void interfaceApplication(){
    System.out.println("Мобильное приложение в InterfaceTelegram");
  }


}