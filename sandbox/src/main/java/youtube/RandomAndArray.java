package youtube;

public class RandomAndArray {
    public static void main (String[] args){
//        Ввод массива
        String[] wordListOne = {"счастье", "удача", "любовь", "нежность"};
        String[] wordListTwo = {"добро", "уют", "обнимашки", "целовашки"};
        String[] wordListTree = {"роботпылесос", "цветы", "кот", "вкусняшки"};

//      Вычисляем сколько слов в массиве
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int treeLength = wordListTree.length;

//    Генерируем 3 случайнх числа
        int rand1 = (int) (Math.random()* oneLength);
        int rand2 = (int) (Math.random()* twoLength);
        int rand3 = (int) (Math.random()* treeLength);

//     Теперь строим фразу
        String phrase = wordListOne[rand1] + ", " + wordListTwo[rand2] + ", " + wordListTree[rand3];

//     Выводим фразу
         System.out.println("Тебя в будующем ждет "+ phrase);

    }
}
