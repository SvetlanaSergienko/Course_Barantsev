package out.course;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
  public static void main(String[] args) {
    // Укажите адрес электронной почты получателя
    String to = "***@mail.ru";
    // Укажите адрес электронной почты отправителя
    String from = "***@inbox.ru";
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
//    Session - класс, который определяет основные сессии почты.
//    Чтобы передать значения в объект сессии, могут быть использованы Properties.
     Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("***@mail.ru", "***");
      }
    });
    // Используется для устранения проблем SMTP
    session.setDebug(true);
    try {
      // Создайте объект MimeMessage по умолчанию.
//      Message - абстрактный класс, который представляет собой сообщения электронной почты.
//      JavaMail реализует RFC822 и MIME стандарты обмена сообщениями.
      MimeMessage message = new MimeMessage(session);
      // Set From: поле заголовка заголовка.
      message.setFrom(new InternetAddress(from));
      // Set To: поле заголовка заголовка.
      message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
      // Set Subject: поле заголовка
      message.setSubject("Это тема!");
      // Теперь установите фактическое сообщение
      message.setText("Это актуальное сообщение");
      System.out.println("отправка...");
//     Отправить сообщение
//      Transport - абстрактный класс, который представляет собой спецификацию протокола передачи.
//      Transport использует объект конкретного протокола передачи, чтобы отправить сообщение.
      Transport.send(message);
      System.out.println("Сообщение отправлено успешно....");
    } catch (MessagingException mex) {
      mex.printStackTrace();
    }
  }
}
