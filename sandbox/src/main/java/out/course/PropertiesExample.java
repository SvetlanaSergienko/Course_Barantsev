package out.course;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
  public static void main(String[] args) throws IOException {

    Properties defaultProperties = new Properties();
    defaultProperties.setProperty("bla2","default with construction");

//    Проперти- похожи на мапу тем что есть ключ и значение и по ключу можно вывести значение

    Properties properties = new Properties(defaultProperties);
//    properties.setProperty("one","1");
//    System.out.println(properties.getProperty("one"));

//    Создает файл my.properties в котором выведены все пропертя
//    Первая строчка my comment, дача и время создания и список всех пропиртей.
//    Можно удалить Строчки 14-15, 23-24 с созданием проперти, редактировать файл и все значения сохрянять
//    Изменения в файле my.properties сразу используются в программе

//    FileOutputStream out = new FileOutputStream("my.properties");
//    properties.store(out, "my comment");

    FileInputStream in = new FileInputStream("my.properties");
    properties.load(in);
    System.out.println(properties.getProperty("max"));

//    дефолтные значения можно
//   1) передвать через запятую
//   2) создать констуктор со всеми дефолтами и туда их передать

    System.out.println(properties.getProperty("bla","default value"));
    System.out.println(properties.getProperty("bla2"));
  }
}
