package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {

  public static void main(String[] args) {

//    создание мапы (словарь) ключа числовой форма тк номер паспорта, значение строковое ФИО
//    ключь всегда уникальный, значение может повторяться
    java.util.HashMap<Integer, String> passportsAndNames = new java.util.HashMap<>();

    passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
    passportsAndNames.put(162348, "Иван Михайлович Серебряков");
    passportsAndNames.put(8082771, "Дональд Джон Трамп");
    System.out.println("Изначальный состав мапы" + passportsAndNames);

//   сохранение в переменную значение элемента мапы по ключу 212133
    String lidiaName = passportsAndNames.get(212133);
    System.out.println(lidiaName);

//   удаление из мапы одной строки с ключом =162348
    passportsAndNames.remove(162348);
    System.out.println(passportsAndNames);

//    Проверяет есть ли в мапе ключ=11111. Ответ true false
    System.out.println(passportsAndNames.containsKey(11111));
//    Проверяет если ли в мапе по значению. Ответ true false
    System.out.println(passportsAndNames.containsValue("Дональд Джон Трамп"));

//    keySet() выводит все ключи мапы
    Set<Integer> keys = passportsAndNames.keySet();
    System.out.println("Ключи: " + keys);

//   values() выводит все значения мапы
    ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
    System.out.println("Значения: " + values);

//    size() - выводит кол-во ключей в мапе
    System.out.println(passportsAndNames.size());
//   clear() - удаляет все ключи и значения в мапе
    passportsAndNames.clear();
    System.out.println(passportsAndNames);


    passportsAndNames.put(2121332, "Лидия Аркадьевна Бубликова 2");
    passportsAndNames.put(1623482, "Иван Михайлович Серебряков 2");
    passportsAndNames.put(80827712, "Дональд Джон Трамп 2");

//    Проверка что мапа не пуста

    if (!passportsAndNames.isEmpty()) {

      System.out.println(passportsAndNames);

    }

//    создание второй мапы
    java.util.HashMap<Integer, String> passportsAndNames2 = new java.util.HashMap<>();

    passportsAndNames2.put(917352, "Алексей Андреевич Ермаков");
    passportsAndNames2.put(925648, "Максим Олегович Архаров");

// добавление в первую мапу все значения второй мапы
    passportsAndNames.putAll(passportsAndNames2);
    System.out.println(passportsAndNames);


//    Пример с работы
//    /**
//     * Проверка отсутствия значения поля в ответе на последний отправленный запрос
//     * Ожидаемое значение может включать в себя строки, мат.выражения и имена переменных
//     *
//     * @param datatable маппинг полей и ожидаемых значений (ключ = путь к требуемому полю в синтаксисе JsonPath или XmlPath, значение = строка или переменная)
//     */
//    @То("^ответ сервиса на последний отправленный запрос не содержит следующее значение поля:$")
//    public void checkIfFieldValuesAreAbsent(Map<String, String> datatable) {
//      datatable.forEach(
//              (path, expectedValue) -> {
//                String resolvedPath = TestVariables.replaceAllVariables(path);
//                String resolvedValue = TestVariables.replaceAllVariables(expectedValue);
//                ArrayList fieldValues = getLastResponse().path(resolvedPath);
//
//                if (fieldValues.contains(resolvedValue)) {
//                  HashMap<String, String> containerMSP = new HashMap<>();
//                  containerMSP.put("web-acquiring", "FOBO_INT_162, FOBO_INT_163");
//                  containerMSP.put("web-data-quality", "FOBO_INT_168");
//                  containerMSP.put("web-delivery", "FOBO_INT_160");
//                  containerMSP.put("web-fiscalization", "FOBO_INT_171");
//                  containerMSP.put("web-logistic", "FOBO_INT_161");
//                  containerMSP.put("web-loyalty", "FOBO_INT_169, FOBO_INT_170");
//                  containerMSP.put("web-partner-purchase", "FOBO_INT_149");
//                  containerMSP.put("web-products", "FOBO_INT_167");
//                  containerMSP.put("web-promomedia", "FOBO_INT_158, FOBO_INT_159");
//                  containerMSP.put("web-promotions", "FOBO_INT_150, FOBO_INT_151, FOBO_INT_152");
//                  containerMSP.put("web-service-info", "FFOBO_INT_153");
//
//                  String s = String.format("Не рабочий контенер [" + resolvedValue + "] на MSP. Данный контенер содержит интеграцию с онлайн интерфейсами %s" + System.lineSeparator() + System.lineSeparator() + getLastResponse().path(resolvedPath), containerMSP.get(resolvedValue));
//                  throw new BDDRuntimeException(s);
//                } else {
//                  Allure.addAttachment("attachment",
//                          "Ожидаемое значение  [" + resolvedValue
//                                  + "] поля '" + resolvedPath + "' " +
//                                  " не содержится в списке фактических значений " + System.lineSeparator() + getLastResponse().path(resolvedPath)
//                  );
//
//                }
//
//              }
//      );
//
//    }

  }

}
