//Данные от пользователя. те вначале что то пользователь вводит и это запоминаем и далее работаем

package youtube;
// java класс для работы с Scanner
import java.util.Scanner;

public class DataFromTheUser {
    public static void main(String[] args) {
    // str объект типа Scanner. System.in - мы будем принимать информацию от пользователя
    Scanner str = new Scanner(System.in);
    // str.nextLine() вывести всю строку. nextInt - вывести целое число
    System.out.println("Вы написали: " + str.nextLine());
    }
}
