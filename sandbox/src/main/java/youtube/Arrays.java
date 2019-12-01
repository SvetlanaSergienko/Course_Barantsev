//Массивы

package youtube;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){

//        массив от переменной отличается [].
//       Можно объявить и так. int[5] - массив из 5 элементов
//        int[] name;
//        name = new int[5];

//        Или так
//        int[] name = new int[5];
////        второму элементу присвоиваем 23. Отсчет в массиве идет с 0 элемента по 4.
//        name[2]=23;

//        Или так. Срузу присваивая значения в массиве. float - дровные. в конце f.
//        float[] name = new float[]{23.76f, 34.32f, 56.12f};
//        System.out.println(name[1]);

//        Массив, где пользователь вводит число элементов в массиве а потом их значения

            int[] a;
            int n;
        Scanner in= new Scanner(System.in);
        System.out.println("Введите кол-во элементов в массиве: ");
        n = in.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++) {
            System.out.print("Присвоить массиву a[" + i + "] значение:");
            a[i] = in.nextInt();

        }
    }
}
