package out.course;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.search.FlagTerm;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Properties;

public class TestMail {
  static final String ENCODING = "UTF-8";

  public static void main(String args[]) throws MessagingException, IOException {
//    POP3 — 995 (протокол шифрования SSL/TLS)
    String subject = "Subject";
//    String content = "Test";
    String smtpHost="smtp.mail.ru";
    String address="***@mail.ru";
    String login="***@mail.ru";
    String password="tango123";
    String smtpPort="995";
    String pop3Host="pop3.mail.ru";
    receiveMessage(login, password, pop3Host);
  }

  public static void receiveMessage(String user, String password, String host) throws MessagingException, IOException {
    Authenticator auth = new MyAuthenticator(user, password);

    Properties props = System.getProperties();
    props.put("mail.user", user);
    props.put("mail.host", host);
    props.put("mail.debug", "false");
    props.put("mail.store.protocol", "pop3");
    props.put("mail.transport.protocol", "smtp");

    Session session = Session.getDefaultInstance(props, auth);
    Store store = session.getStore();
    store.connect();
    Folder inbox = store.getFolder("INBOX");
    inbox.open(Folder.READ_WRITE);

    Message[] messages = inbox.search(new FlagTerm(new Flags(Flags.Flag.SEEN), false));
    ArrayList<String> attachments = new ArrayList<String>();

    LinkedList<MessageBean> listMessages = getPart(messages,
            89);

    inbox.setFlags(messages, new Flags(Flags.Flag.SEEN), true);
    inbox.close(false);
    store.close();
  }

  private static LinkedList<MessageBean> getPart(Message[] messages, ArrayList<string> attachments) throws MessagingException, IOException {
    LinkedList<MessageBean> listMessages = new LinkedList<MessageBean>();
    SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
    for (Message inMessage : messages) {
      attachments.clear();
      if (inMessage.isMimeType("text/plain")) {
        MessageBean message = new MessageBean(inMessage.getMessageNumber(), MimeUtility.decodeText(inMessage.getSubject()), inMessage.getFrom()[0].toString(), null, f.format(inMessage.getSentDate()), (String) inMessage.getContent(), false, null);
        listMessages.add(message);
      } else if (inMessage.isMimeType("multipart/*")) {
        Multipart mp = (Multipart) inMessage.getContent();
        MessageBean message = null;
        for (int i = 0; i < mp.getCount(); i++) {
          Part part = mp.getBodyPart(i);
          if ((part.getFileName() == null || part.getFileName() == "") && part.isMimeType("text/plain")) {
            message = new MessageBean(inMessage.getMessageNumber(), inMessage.getSubject(), inMessage.getFrom()[0].toString(), null, f.format(inMessage.getSentDate()), (String) part.getContent(), false, null);
          } else if (part.getFileName() != null || part.getFileName() != ""){
            if ((part.getDisposition() != null) && (part.getDisposition().equals(Part.ATTACHMENT))) {
              attachments.add(saveFile(MimeUtility.decodeText(part.getFileName()), part.getInputStream()));
              if (message != null) message.setAttachments(attachments);
            }
          }
        }
        listMessages.add(message);
      }
    }
    return listMessages;
  }

  private static String saveFile(String filename, InputStream input) {
    String path = "attachments\\"+filename;
    try {
      byte[] attachment = new byte[input.available()];
      input.read(attachment);
      File file = new File(path);
      FileOutputStream out = new FileOutputStream(file);
      out.write(attachment);
      input.close();
      out.close();
      return path;
    } catch (IOException e) {
      e.printStackTrace();
    }
    return path;
  }
}

class MyAuthenticator extends Authenticator {
  private String user;
  private String password;

  MyAuthenticator(String user, String password) {
    this.user = user;
    this.password = password;
  }

  public PasswordAuthentication getPasswordAuthentication() {
    String user = this.user;
    String password = this.password;
    return new PasswordAuthentication(user, password);
  }
}