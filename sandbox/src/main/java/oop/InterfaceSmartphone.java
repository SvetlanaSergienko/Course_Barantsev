package oop;


public class InterfaceSmartphone {

//Приложение и мессенджер, конечно, похожи, но все-таки это разные вещи.
//  Мессенджер может быть и мобильным, и десктопным, в то время как Application — это именно мобильное приложение.

//  Поле (объект) Application установленноне мобильное приложение
  private InterfaceApplication interfaceApplication;


  public InterfaceSmartphone() {
    this.interfaceApplication = new InterfaceTelegram();
  }
}
