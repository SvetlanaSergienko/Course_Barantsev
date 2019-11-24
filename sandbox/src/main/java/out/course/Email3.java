package out.course;


//Дома вариант 2
//Джава раш
//https://javarush.ru/quests/lectures/questcollections.level10.lecture05
// https://javarush.ru/groups/posts/1226-kak-otpravitjh-pisjhmo-iz-java-prilozhenija-s-primerom

import javax.mail.*;
import javax.mail.Message.RecipientType;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;
import java.io.FileInputStream;
import java.util.Properties;

import static javax.mail.Message.*;

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


import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.xml.stream.XMLStreamException;
import java.util.Properties;


public class Email3 {

////1) Установить соединение с почтовым сервером, через который будет отправлено письмо
////  Properties props = new Properties();
//
//  //тут надо загрузить данные в объект props
//  final Properties properties = new Properties();
//  FileInputStream in = new FileInputStream("email.properties");
//    properties.load(in);
//
//    System.out.println(properties.getProperty("mail.user"));
//
//  Session session = Session.getDefaultInstance(properties);
//
////2) Создать письмо, добавить вложения если надо
////создаем сообщение
//  MimeMessage message = new MimeMessage(session);
//
////устанавливаем тему письма
//  message.setSubject("тестовое письмо!");
//
////добавляем текст письма
//  message.setText("Asta la vista, baby!");
//
////указываем получателя
//  message.addRecipient(RecipientType.TO, new InternetAddress("cergienko@inbox.ru"));
//
////указываем дату отправления
////  message.setSentDate(new Email3());
//
////3) Отправить письмо.
////логин и пароль gmail пользователя
//String userLogin = "cergienko@gmail.com";
//  String userPassword = "Vodolej22";
//
//  //авторизуемся на сервере:
//  Transport transport = session.getTransport();
//transport.connect("smtp.gmail.com", 465, userLogin, userPassword);
//
////отправляем сообщение:
//transport.sendMessage(message, message.getRecipients(RecipientType.TO));

}

