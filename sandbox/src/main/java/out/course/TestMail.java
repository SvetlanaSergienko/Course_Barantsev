package out.course;

import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.search.FlagTerm;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Properties;

// Не работающий пример. Перебор всех входящих с учетом вложения
// http://ryakovlev.blogspot.com/2014/11/java_17.html

public class TestMail {
//  static final String ENCODING = "UTF-8";
//
//  public static void main(String args[]) throws MessagingException, IOException {
////    POP3 — 995 (протокол шифрования SSL/TLS)
//    String subject = "Subject";
////    String content = "Test";
//    String smtpHost="smtp.mail.ru";
//    String address="***@mail.ru";
//    String login="***@mail.ru";
//    String password="tango123";
//    String smtpPort="995";
//    String pop3Host="pop3.mail.ru";
//    receiveMessage(login, password, pop3Host);
//  }
//
//  public static void receiveMessage(String user, String password, String host) throws MessagingException, IOException {
//    Authenticator auth = new MyAuthenticator(user, password);
//
//    Properties props = System.getProperties();
//    props.put("mail.user", user);
//    props.put("mail.host", host);
//    props.put("mail.debug", "false");
//    props.put("mail.store.protocol", "pop3");
//    props.put("mail.transport.protocol", "smtp");
//
////    Session - класс, который определяет основные сессии почты.
//    Session session = Session.getDefaultInstance(props, auth);
//    Store store = session.getStore();
////  Используя метод connect класса Service из сессии мы получаем хранилище и подключаемся к нему
//    store.connect();
////    Получаем из хранилища папку с входящими сообщениями используя метод getFolder
//    Folder inbox = store.getFolder("INBOX");
////    Этот метод по умолчанию возвращает нам закрытую папку, поэтому мы открываем ее на чтение и запись.
//    inbox.open(Folder.READ_WRITE);
//
//    Message[] messages = inbox.search(new FlagTerm(new Flags(Flags.Flag.SEEN), false));
//    ArrayList<String> attachments = new ArrayList<String>();
//
////   метод getPart, в котором выполняется обработка полученных сообщений
////   а именно: проверка типа сообщения, в соответствии с которым потом извлекается его содержимое
////    также данный метод формирует список экземпляров бина сообщения, который собственно и возвращается главному методу.
//
//    LinkedList<MyAuthenticator.MessageBean> listMessages = getPart(messages,
//            89);
//
//    inbox.setFlags(messages, new Flags(Flags.Flag.SEEN), true);
//    inbox.close(false);
//    store.close();
//  }
//
////  для получения писем можно использовать простой метод inbox.getMessages();
////  Метод возвращают массив сообщений, который передается внутрь метода getPart(), в котором, как уже было сказано выше выполняется проверка типа сообщения:
////  - Если это простое сообщение, то создается экземпляр бина, поля которого инициализируется содержимым сообщения
////  - Если это Multipart сообщение, то мы получаем содержимое письма как Multipart и начинаем просматривать части сообщений:
////  Если часть содержит простой контент, то он сохраняется в полях бина
////  Если часть содержит вложение, то выполняется метод saveFile(), который сохраняет вложение, а путь к нему сохраняет в бине.
//
//  private static LinkedList<MyAuthenticator.MessageBean> getPart(Message[] messages, ArrayList<string> attachments) throws MessagingException, IOException {
//    LinkedList<MyAuthenticator.MessageBean> listMessages = new LinkedList<MyAuthenticator.MessageBean>();
//    SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
//    for (Message inMessage : messages) {
//      attachments.clear();
//      if (inMessage.isMimeType("text/plain")) {
//        MyAuthenticator.MessageBean message = new MyAuthenticator.MessageBean(inMessage.getMessageNumber(), MimeUtility.decodeText(inMessage.getSubject()), inMessage.getFrom()[0].toString(), null, f.format(inMessage.getSentDate()), (String) inMessage.getContent(), false, null);
//        listMessages.add(message);
//      } else if (inMessage.isMimeType("multipart/*")) {
//        Multipart mp = (Multipart) inMessage.getContent();
//        MyAuthenticator.MessageBean message = null;
//        for (int i = 0; i < mp.getCount(); i++) {
//          Part part = mp.getBodyPart(i);
//          if ((part.getFileName() == null || part.getFileName() == "") && part.isMimeType("text/plain")) {
//            message = new MyAuthenticator.MessageBean(inMessage.getMessageNumber(), inMessage.getSubject(), inMessage.getFrom()[0].toString(), null, f.format(inMessage.getSentDate()), (String) part.getContent(), false, null);
//          } else if (part.getFileName() != null || part.getFileName() != ""){
//            if ((part.getDisposition() != null) && (part.getDisposition().equals(Part.ATTACHMENT))) {
//              attachments.add(saveFile(MimeUtility.decodeText(part.getFileName()), part.getInputStream()));
//              if (message != null) message.setAttachments(attachments);
//            }
//          }
//        }
//        listMessages.add(message);
//      }
//    }
//    return listMessages;
//  }
//
////  метод saveFile который сохраняет вложения из писем в каталог attachments.
//  private static String saveFile(String filename, InputStream input) {
//    String path = "attachments\\"+filename;
//    try {
//      byte[] attachment = new byte[input.available()];
//      input.read(attachment);
//      File file = new File(path);
//      FileOutputStream out = new FileOutputStream(file);
//      out.write(attachment);
//      input.close();
//      out.close();
//      return path;
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//    return path;
//  }
//}
//
//class MyAuthenticator extends Authenticator {
//  private String user;
//  private String password;
//
//  MyAuthenticator(String user, String password) {
//    this.user = user;
//    this.password = password;
//  }
//
//  public PasswordAuthentication getPasswordAuthentication() {
//    String user = this.user;
//    String password = this.password;
//    return new PasswordAuthentication(user, password);
//  }
}