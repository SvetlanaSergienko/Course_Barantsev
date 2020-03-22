package oop;

//  Представь, что мы проектируем программу, в которой у нас будут собраны данные клиентов.
//  В классе Client обязательно нужно поле, указывающее, каким именно мессенджером клиент пользуется.

// множественного наследования в Java нет. А вот множественная реализация интерфейсов — есть
public class InterfaceClient {

  private InterfaceMessenger interfaceMessenger;

//Без интерфейсов это выглядело бы странно:

//  private WhatsApp whatsApp;
//  private Telegram telegram;
//  private Viber viber;

  public InterfaceClient() {
    this.interfaceMessenger = new InterfaceTelegram();
  }

}
