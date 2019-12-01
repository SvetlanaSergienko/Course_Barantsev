//Функции
package youtube;
import java.util.Scanner;

public class FunctionsOrMethods {

/**
 * Ниже вся строчка эта функции (метод) расписана
*   public (публичный) - модификатор доступа. Всгда указывать. 3 варианта заполнения (подробнее в ООП)
*   static - 2 варианта. далее подробнее
*   void (ничего не возвращаем функции) - например просто выводят что то на экран
*   main - имя функции
*   String[] args (строковый масссив с названием args) - параметр функции
 */
    public static void main (String[] args) {
//
/**   Пример без void  (запоминает значение return result)
*     Ниже рассмотрим как ссылаться на функцию
*/
//        int temp = func(3, 4);
//        System.out.print(temp);
//    }

/**
 * Ниже функция, котоая возводит число a в стпень b
*   void (ничего не возвращаем функции) - например просто выводят на экран
*   int - тип функции
*   func - название функции
*   () -параметры. может пустым а может заполненым
*   return - вернуть результат функции. Если void в методе то без него. выход из цикла в функциях
*/

//   public static int func (int a,int b){
//           int result = 1;
//           for (int i=0; i<b; i++)
//               result*=a;
//           return result;
//        }

//   Пример с void (выводит значение на экран)
//    func2(2, 3) - присвоиваем значения ункции)
       func2(2, 3);
       readArray();
    }
    public static void func2 (int a,int b){
        int resultt = 1;
        for (int i=0; i<b; i++)
            resultt*=a;
        System.out.println(resultt);
/**
 *рекурсивная функция пример
 *  Если ниже присвоить значения функции/функция вызовит саму себя
 * func2(1, 2);
 */
    }

    public static int[] readArray (){
        int[] arr;
        int n;
        System.out.print("Введите кол-во элементов массива: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++){
            int j=i+1;
            System.out.print("Введите " + j + " элемент массива: ");
            arr[i] = in.nextInt();
        }
        return arr;

    }



    }
