package out.course;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.text.StrSubstitutor;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;

import static java.nio.charset.StandardCharsets.UTF_8;

public class readAndDeleteFile {

//добавить код на чтение и удаление файла используя
//String body = FileUtils.readFileToString(Paths.get(requestTemplatePath).toFile(), UTF_8);

  public static void main(String[] args) {
    String f = System.getProperty("user.dir");
    System.out.println(f);

    String str = "HelloWorld";
//    замена в строчки слова
    str = str.replace("Hello", "GoodBye");
    System.out.println(str); // выведет GoodByeWorld

    replacementValuesWithHashMap();
  }

  public static void replacementValuesWithHashMap() {
    String requestTemplatePath;

//    в мапе переменные на что менять в файле
    HashMap<String, String> parametersMap = new HashMap<>();
    parametersMap.put("shopNumber", "##Номер_магазина##");
    parametersMap.put("productCode", "##Стандартный товар##");
    parametersMap.put("zone", "1");
    parametersMap.put("quantity", "1");

//    путь в файлу. System.getProperty("user.dir") - ссылка на то где лежит проект
    requestTemplatePath = System.getProperty("user.dir") + "\\sandbox\\src\\resources\\xml\\createReserve.xml";


    try {
//    Вариант 1 построчно считать каждую строчку
//      List<String> lines = Files.readAllLines(Paths.get(requestTemplatePath), UTF_8);
//      String body = "";
//      for (String line : lines) {
//        body += line;
//      }
//      System.out.println(">>>>>" + body);

//      Вариант 2 считать весь файл целиком
            String body = FileUtils.readFileToString(Paths.get(requestTemplatePath).toFile(), UTF_8);

//     StrSubstitutor для замены
      StrSubstitutor sub = new StrSubstitutor(parametersMap);

//      заменяем все значения в файле body на занчения из мапы
      String requestBody = sub.replace(body);
      System.out.println(">>>>>" + requestBody);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }


//  /**
//   * Метод создает резерв через сервис со стандартным товаром
//   *
//   * @return reserveCode
//   */
//  public static String createReserveByService() {
//    HashMap<String, String> parametersRereserve = new HashMap<>();
//    parametersRereserve.put("shopNumber", "##Номер_магазина##");
//    parametersRereserve.put("productCode", "##Стандартный товар##");
//    parametersRereserve.put("zone", "1");
//    parametersRereserve.put("quantity", "1");
//    String requestNameReserve = "Резервирование товара xml";
//    sendPostRequestXML(requestNameReserve,
//            "template/xml/createReserve.xml", parametersRereserve);
//    String path = "Header.Body.reservationOrderResponse.responseHeader.responseCode";
//    checkTheSuccessfulResponseOfTheService(requestNameReserve, path);
//    String reserveCode;
//    reserveCode = getLastResponse().
//            path("Header.Body.reservationOrderResponse.responseBody.positionList.position.find{it.positionId =='1'}.reservationCode");
//    return reserveCode;
  }

