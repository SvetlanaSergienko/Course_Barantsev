package out.course;

//Дома по ютубу https://www.youtube.com/watch?v=lsat4guY1kc

import com.sun.corba.se.impl.oa.toa.TOA;
import com.sun.xml.internal.org.jvnet.mimepull.MIMEMessage;
import org.xml.sax.SAXException;
import sun.plugin2.message.Message;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

//Нужно скачать javax.mail.jar (java mail api reference)
//https://github.com/javaee/javamail/releases

import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.xml.stream.XMLStreamException;
import java.util.Properties;

public class Email {
  public static void main(String[] args) throws MessagingException, IOException{

//    1 этап. Прочитать файл с пропертями "email.properties"
    final Properties properties = new Properties();
    FileInputStream in = new FileInputStream("email.properties");
//    properties.load(EmailLesson.class.getClassLoader().getResourceAsStream("email.properties"));
    properties.load(in);
//    Session session = Session.getDefaultInstance(properties);

    properties.load(in);
    System.out.println(properties.getProperty("mail.user"));



//   2 этап. Настройка сообщения которое будем отправлять
//    setFrom - от кого, те отправляем с моей почты
//    addRecipient добавляем людей которым будем отправлять.
//    TO(Кому), From(адрес E-mail от кого), Subject(Тема), СC(Копия), ВСC(Скрытая копия)
//    setSubject-тема письма
//    setText -текст внутри письма
    Session mailSession = Session.getDefaultInstance(properties);
    MimeMessage message = new MimeMessage(mailSession);
//    message.setFrom(new InternetAddress("myemail"));
    message.setFrom(new InternetAddress("cergienko1@gmail.ru"));
    message.addRecipient(RecipientType.TO,new InternetAddress("cergienko@inbox.ru"));
    message.setSubject("hello");
    message.setText("Hi this my test message");

//    3 этап Отправка самого письма через Transport
    Transport tr = mailSession.getTransport();
//    tr.connect("mail.user","mail.Password"); /*пароль от почты*/
//    tr.connect(null,"123"); /*пароль от почты*/
//    tr.connect("smtp.gmail.com", 465, "mail.user", "mail.Password");
    tr.connect("ssl://smtp.inbox.ru", 465, "mail.user", "mail.Password");
    System.out.println("контакт с письмом налажен");
    tr.sendMessage(message, message.getRecipients(RecipientType.TO));/*отправляем сообщение*/
    tr.sendMessage(message, message.getAllRecipients()); /* вызов сообщения */
    tr.close();





  }
}
