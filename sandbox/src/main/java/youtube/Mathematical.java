// Математические операции + - * /. При делении лучше использовать float. % остаток.

package youtube;
import java.util.Scanner;

public class Mathematical {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.print("Введи первое чиисло: ");
        first = num.nextInt();
        System.out.print("Введи второе число: ");
        second = num.nextInt();

        result = first + second;
        //  result = result + 2; Что бы два раза не описать переменную можно сократить. Аналогично с +-*/%
        result +=2;
        //  result = result + 1; Аналогично с +-
        result++;
        System.out.println("Результат: " + result);
    }
}
