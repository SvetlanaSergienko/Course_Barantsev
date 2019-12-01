package out.course;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import java.util.Properties;

//Проверить что на почту пришло конктеное письмо от конкретной почты

public class GetMail {
  public static void main(String[] args) throws MessagingException {
    
    //Объект properties содержит параметры соединения
    Properties properties = new Properties();
    properties.setProperty("mail.imap.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

    //Создаем соединение для чтения почтовых сообщений
    Session session = Session.getDefaultInstance(properties);
    //Это хранилище почтовых сообщений. По сути - это и есть почтовый ящик
    Store store = null;
    try {
      //Для чтения почтовых сообщений используем протокол IMAP.
      store = session.getStore("imap");
      //Подключаемся к почтовому ящику
      store.connect("imap.mail.ru", 993, "***@mail.ru", "***");
      //Это папка, которую будем читать
      Folder inbox = null;
      try {
        //Читаем папку "Входящие сообщения"
        inbox = store.getFolder("INBOX");
        //Будем только читать сообщение, не меняя их
        inbox.open(Folder.READ_ONLY);

        //Получаем количество сообщения в папке
        int count = inbox.getMessageCount();
        //Вытаскиваем все сообщения с первого по последний
        Message[] messages = inbox.getMessages(1, count);
        //Циклом пробегаемся по всем сообщениям
//        for (Message message : messages) {
//          //От кого
//          String from = ((InternetAddress) message.getFrom()[0]).getAddress();
//          System.out.println("FROM: " + from);
//          //Тема письма
//          System.out.println("SUBJECT: " + message.getSubject());
//        }

        String from = "***@mail.ru";
        String subject = "Это тема!";

//        for (int i=0; i<messages.length; i++) {
          for (int i=0; true; i++) {
          String from2 = ((InternetAddress) messages[i].getFrom()[0]).getAddress();
          String subject2 = messages[i].getSubject();
//         equals()- Для сравнения значения строк
//         equalsIgnoreCase() - Если важно содержание и последовательность конкретных символов, а не их капслог (адреса)
          if(subject == subject2.intern()&&from==from2.intern()) {
//          System.out.println(subject == subject2.intern());
            System.out.println("Письмо пришло");
          System.out.println(i + ": "
                  + from2 + " " + subject2);
          return;
          }
        }
//        int j=0;
//       while (false){
//         for (int i=0; i<messages.length; i++) {
//          for (int i=0; true; i++) {
//          String from2 = ((InternetAddress) messages[i].getFrom()[0]).getAddress();
//          String subject2 = messages[i].getSubject();
////         equals()- Для сравнения значения строк
////         equalsIgnoreCase() - Если важно содержание и последовательность конкретных символов, а не их капслог (адреса)
//          if(subject == subject2.intern()&&from==from2.intern()) {
////          System.out.println(subject == subject2.intern());
//            System.out.println("Письмо пришло");
//          System.out.println(i + ": "
//                  + from2 + " " + subject2);
//          }
//        }



//       }
      } finally {
        if (inbox != null) {
          //Не забываем закрыть собой папку сообщений.
          inbox.close(false);
        }
      }

    } finally {
      if (store != null) {
        //И сам почтовый ящик тоже закрываем
        store.close();
      }
    }
  }
}