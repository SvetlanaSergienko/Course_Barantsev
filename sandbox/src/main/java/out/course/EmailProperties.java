package out.course;

//Дома по ютубу https://www.youtube.com/watch?v=lsat4guY1kc

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EmailProperties {
  public static void main(String[] args) throws IOException {
    Properties properties =new Properties();

    FileInputStream in = new FileInputStream("email.properties");
    properties.load(in);
    System.out.println(properties.getProperty("max"));
  }
}
