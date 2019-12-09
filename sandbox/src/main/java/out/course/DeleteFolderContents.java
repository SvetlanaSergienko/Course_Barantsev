package out.course;

//import org.apache.commons.io.FileUtils;

import java.io.File;

public class DeleteFolderContents {

//  Выводить содержимое файла (работает и дома и на работе)
          public static void main(String[] args) {
            DeleteFolderContents clean = new DeleteFolderContents();
            clean.getFileNameFromFolder("C:\\Users\\cergi\\OneDrive\\Рабочий стол\\английский");
        }

        public void getFileNameFromFolder(String folderName) {
            File folder = new File(folderName);
            File[] listOfFiles = folder.listFiles();
            for(int i=0; i<listOfFiles.length; i++) {
                System.out.println(listOfFiles[i].getName());
            }
        }

//  Создает папку с файлом и удаляет файл (работает только на работе)
//  public static void main(String[] args) {
//      /*Создаем папку на рабочем столе*/
//      String folderName = "My Folder";
//      String folderPath = System.getProperty("user.home") + "/Desktop";
//
//      File myFolder = new File(folderPath + "/" + folderName);
//      myFolder.mkdir();
//
//      /*Создаем текстовый документ в созданной выше папке*/
//      String fileName = "My File.txt";
//      String filePath = System.getProperty("user.home") + "/Desktop/My Folder";
//
//      File myFile = new File(filePath + "/" + fileName);
//
//      try {
//        myFile.createNewFile();
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
//
//      /* myFile.delete(); - раньше удалял файл, сейчас закомментен */
////    myFile.delete();


// Удаляет полностью содержимое папки (работает только на работе)
//      public static void main(String[] args) throws IOException {
//      File myFolder = new File("D:\\java\\Email\\df");
//      FileUtils.cleanDirectory(myFolder);
//    }
}
