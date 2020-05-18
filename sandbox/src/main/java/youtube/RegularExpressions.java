package youtube;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
  public static void main (String[] args) {

    String caseName = "001. Название кейса очень большое";
    String caseNumber = caseName;

//    Вариант 1 через индексы
//    int index = caseName.indexOf(' '); // ищем индекс первого пробела
//    int index2 = caseName.indexOf('.'); // ищем индекс первой точки
//    if (index2 < index && index2 != -1) {
//      index = index2;
//    }
//    if (index != -1) {
//      caseNumber = caseName.substring(0, index);
//    }

//    Вариант 2 серез регулярные выражения
    Pattern pattern = Pattern.compile("^.+?[ .]"); //с начала ^ до первой точки или пробела
    Matcher matcher = pattern.matcher(caseNumber);
    while (matcher.find()) {
      caseNumber=caseNumber.substring(matcher.start(), matcher.end()-1); // все значения от начала до первой точки и пробла вырезая точку и пробел
    }

    DateTime dateTime = DateTime.now(); //дата и время сейчас
    DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH-mm-ss"); // в формат перевела
    System.out.println("ТК_" + caseNumber + "_" + formatter.print(dateTime)); //соединение маски

//    Сохранение значения в переменную variableName (на работе работает)
//    TestVariables.saveVariable(variableName, "ТК_" + caseNumber + "_" + formatter.print(dateTime));
  }
}
