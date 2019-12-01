//Циклы (For, While, Do while)

package youtube;

public class Сycle {

    public static void main(String[] args) {
//        у for {} если больше одной строчки внутри. Переменную i можно обявить как за циклом так и внутри
//        если не i++ a i-=10 будет отнимать 10 после каждого цикла
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

//       int j=0;
//       while (j<20){
//           System.out.println(j);
//           j+=2;
//       }

//        while=пока
//       если  while (true)  то будем проверять буевые значения (в for такая проверка не правильная)
//        boolean isTrue = true;
//        int x = 0;
//        while (isTrue) {
//            System.out.println(x);
//        x += 2;
//        if (x > 10)
//            isTrue = false;
//        }

//        do while всегда выполниться хотя бы один раз даже если не верно, те вначале выводит а потом проверяет
//        int y=13;
//        do {
//            y--;
//            System.out.println(y);
//        }
//        while (y<10);


//        общее (для всех)
//        break - Выйти из цикла, return - тоже выход из цикла, но лучше использовать в фуекциямх и методах.
//        boolean isTrue = true;
//        int x = 0;
//        while (isTrue) {
//            System.out.println(x);
//        x += 2;
//        if (x > 10)
//            return;
//        }

//        Общее (для всех)
//      continue Пропуск конкретной итерации. Ниже пример пропускает все числа которые делятся на 2.
        int x = 0;
        while (x<100) {
            x++;
            if (x %2 ==0)
                continue;
            System.out.println(x);

        }
    }
}
