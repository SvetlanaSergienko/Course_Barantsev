// пакеты java. com.youtube - стандартные пакеты, которые объеденяет некоторые классы
package youtube;
// стандартный класс для импорта строк
        import java.lang.String;

//класс.
// public - доступен будет в остальных пакетах (private - доступен в рамках класса)
// class - класс,
// Main - имя основного класса который запускается при старте
public class Variable {

    //метод.
    // public - доступен будет в остальных пакетах.
    // void - функция ничего не возвращает,
    // String[] - массив, args - имя массива
    public static void main(String[] args) {

        // вывести на экране Hello word и перейти на новую строчку
        System.out.println("Hello word");
        // вывести на экране Hello word
        System.out.print("Hello word");
        // вывести новую строку
        System.out.println("\n");

        //Переменные
        // перменные числа -128 до 127
        byte num = 23;
        int num_1 = 43455625;
        float num_2 =34.63f;
        double num_3 = 252.3454545d;
        boolean isTrue = true;
        char sys = 'r';
        String str = "Hello word!";

        System.out.println(num);
        System.out.println(num_2);
        System.out.println(num_3);
        System.out.println(isTrue);
        System.out.println(str);



    }
}
