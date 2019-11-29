package out.course;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import static out.course.EmailGet.prepareMassage;

public class GetMail {
  public static void main(String[] args) {
    // Укажите адрес электронной почты получателя
    String to = "***@mail.ru";
    // Укажите адрес электронной почты отправителя
    String from = "***@mail.ru";
    // Упомяните адрес SMTP-сервера. Ниже SMTP-сервер Gmail используется для отправки электронной почты
    String host = "smtp.mail.ru";
    // Получить системные свойства properties
    Properties properties = System.getProperties();
    // Настройка почтового сервера
    properties.put("mail.smtp.host", "true");
    properties.put("mail.smtp.host", host);
    properties.put("mail.smtp.port", "465");
    properties.put("mail.smtp.auth", "true");
    properties.put("mail.transport.protocol", "smtp");
//    sll -протокол шифрования
    properties.put("mail.smtp.ssl.enable", "true");
    properties.put("mail.smtp.socketFactory.class",
            "javax.net.ssl.SSLSocketFactory");


    // Получите объект Session .// и передайте имя пользователя и пароль
    Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("***@mail.ru", "***");
      }
    });
    // Используется для устранения проблем SMTP
    session.setDebug(true);
    try {
      // Создайте объект MimeMessage по умолчанию.
      MimeMessage message = new MimeMessage(session);
      // Set From: поле заголовка заголовка.
      message.setFrom(new InternetAddress(from));
      // Set To: поле заголовка заголовка.
      message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
      // Set Subject: поле заголовка
      message.setSubject("Это тема!");
      // Теперь установите фактическое сообщение
      message.setText("Это актуальное сообщение");
      System.out.println("Настройки содержимого письма сделаны");
    } catch (MessagingException mex) {
      mex.printStackTrace();
    }

    String recipient;
    Message message = prepareMassage(session, to, recipient);

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

  }
}

