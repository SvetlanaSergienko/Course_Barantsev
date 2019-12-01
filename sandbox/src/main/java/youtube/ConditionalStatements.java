//Условные операторы
package youtube;
import java.util.Scanner;

public class ConditionalStatements {


    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, secont = 50;
//      Постоянная (констата) переменная NUMBER_CONSTANT=0.
//      Название с большой буквы и разделено _
//      Создается с final
        final int NUMBER_CONSTANT = 0;
        System.out.println("Постоянная переменная " + NUMBER_CONSTANT);



        boolean isTrue = true;
//        boolean isFalse = false;
        System.out.println("Введите первое число: ");
        first = num.nextInt();

//       если secont = first =51, то 23 иначе 45
//        secont = first ==51 ? 23 :45;
//      по сути, но тк это булеан пишем сокращенно  isTrue = first == 51 ? true : false
        isTrue = first == 51;


//    == > < <= >= &&  ||
//       isTrue равно isTrue = true
        if (first>=secont || isTrue) {
            System.out.println("Число >= " + secont);
            System.out.println("\n");
        }else if (first==45)
        System.out.println("Число = " + first);
        else {
            System.out.println("Число меньше " + secont);
        }

//        switch массив где число равно конкретному значению, вконце можно поставить default и у него break не писать
        switch (first) {
            case 51:
                System.out.println("Число = 51");
                break;
            case 48:
                System.out.println("Число = 48");
                break;
            case 52:
                System.out.println("Число = 52");
                break;
            default:
                System.out.println("Число по дефолту");
        }



    }

}
