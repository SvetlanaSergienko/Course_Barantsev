package out.course;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFilePDF {
  public static void main(String[] args) throws FileNotFoundException {
//    File.separator получаем на основании системы Windows Unix какой разделительмежду папками
    String separator = File.separator;
    String path = "D:" + separator + "java" + separator + "test" + separator + "test.pdf";
  File file = new File(path);


    Scanner scanner = new Scanner(file);
    while (scanner.hasNextLine()) {
      System.out.println(scanner.nextLine());
    }


//    File fileTest = new File("D:\\java\\test\\test.pdf");
    if (file.exists()){
      file.delete();
    }
    //    всегда если используем scanner нужно закрывать потом scanner.close();
    scanner.close();



//    На работе почему то работает, а дома нет
//    Выводит полный текст pdf файла
//    PDDocument document = PDDocument.load(new File("test2.pdf"));
//    if (!document.isEncrypted()) {
//      PDFTextStripper stripper = new PDFTextStripper();
//      String text = stripper.getText(document);
//      System.out.println("Text:" + text);
//    }
//    document.close();

//    На работе почему то работает, а дома нет
//    ищет в файле содержимое текста
//    /**
//     * Метод проверяет содержание файла PDF
//     *
//     * @param filePath - путь к файлу
//     * @param values - искомые значения ячеек
//     */
//    @Если("^PDF файл '(.*)' вывести содержимое:$")
//    public void checksTheContentsOfPDFFile(String filePath, List<String> values) throws IOException {
//      try {
//        PDDocument document = PDDocument.load(new File(filePath));
//        if (!document.isEncrypted()) {
//          PDFTextStripper stripper = new PDFTextStripper();
//          String text = stripper.getText(document);
//          for (String value : values) {
//            if (text.contains(value)) {
//              LOGGER.info("In file {} found {}", filePath, value);
//            } else {
//              LOGGER.info("In file {} not found {}", filePath, value);
//              throw new BDDRuntimeException(String.format("В PDF файле '%s' не найден элемент '%s'\n" + "Полное содержимое файла: \n %s \n", filePath, value, text));
//            }
//          }
//        }
//        document.close();
//      } catch (IOException e) {
//        LOGGER.error(String.format("Возникла ошибка проверки доступа к файлу %s", filePath), e);
//        throw e;
//      }
//    }

  }
}
