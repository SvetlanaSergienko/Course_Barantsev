package out.course;

//НА работе

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;



public class EmailGet {

  public static void getMail(String recipient) throws Exception {

    Properties properties = new Properties();
    System.out.println("Начало");

//        Сервер мой = c6afe9be-f6fc-4791-b065-bf7277930008@mvideo.ru
//        MAPI
//        SMTP порт = 465
//    Сервер исходящей почты (SMTP-сервер) ssl://smtp.inbox.ru
//    Имя пользователя — vash_pomoshnik@mail.ru
//    Порт SMTP : 465
    properties.put("mail.smtp.host", "ssl://smtp.inbox.ru");
//    properties.put("mail.smtp.socketFactory.port", "465");
//        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
    properties.put("mail.smtp.auth", "true");
    properties.put("mail.smtp.port", "465");
    properties.put("mail.transport.protocol", "smtp");
//    properties.put("mail.smtps.host", "ssl://smtp.inbox.ru");
//    properties.put("mail.smtps.auth", "true");
//    properties.put("mail.smtp.sendpartial", "true");

//    через проперти(не удалось)
//    final Properties properties = new Properties();
//    FileInputStream in = new FileInputStream("email.properties");
//    properties.load(in);
//    System.out.println(properties.getProperty("max"));
//
//    properties.load(EmailLesson.class.getClassLoader().getResourceAsStream("email.properties"));

    // идентификатор электронной почты получателя должен быть упомянут.
    String to = "cergienko@inbox.ru";
    String password = "Germagen1624";

    // идентификатор электронной почты отправителя должна быть указана
    String from = "cergienko1@gmail.ru";


    Session session = Session.getInstance(properties, new Authenticator() {
      @Override
      protected PasswordAuthentication getPasswordAuthentication() {
//                return super.getPasswordAuthentication();
        return new PasswordAuthentication(to, password);
      }
    });

    Message message = prepareMassage(session, to, recipient);

    Transport.send(message);
    System.out.println("письмо отправлено");
  }

  private static Message prepareMassage(Session session, String from, String recipient) {
    try {
      Message message = new MimeMessage(session);
//                message.setFrom(new InternetAddress(to));
      message.setFrom(new InternetAddress(from));
      message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
//                message.setSubject("Создание счета по договору 61347500137/S152");
      message.setSubject("Создание счета по договору 61347500137/S152");
      return message;
    } catch (Exception ex) {
      Logger.getLogger(EmailGet.class.getName()).log(Level.SEVERE,null, ex);
    }
    return null;
  }


//        Session s = Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
//            protected PasswordAuthentication getPasswordAuthentication(){
//                return new PasswordAuthentication("user@yandex.ru","password"); }});


//        message.setSubject("Создание счета по договору 61347500137/S152");

//        Session session = Session.getDefaultInstance(System.getProperties());
//        FileInputStream fis = new FileInputStream(pathToMessage);
//        MimeMessage mimeMessage = new MimeMessage(session, fis);



}

