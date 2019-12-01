package oop;



public class NestedAnonymousComputer {
//    Новый класс внутри класса комьютера
//    Мы можем обращаться к классу компьютер и к объектам i7 transfer, и к методам вложенных классов
    class Proccessor {
//    isStart -тновая булева переменная.
//    Достпна только для класса комьютер, тк она есть только у компьютера
        private boolean isStart = false;

//        Метод включения компа
        public void srart (){
           isStart = true;
           System.out.println("Процессор "+ isStart);
        }

//        Метод выключения компа
         public void shutdown (){
        isStart = false;
        System.out.println("Процессор "+ isStart);
         }
    }

    class RAM {
        private boolean isStart = false;

        public void srart (){
            isStart = true;
            System.out.println("Память " + isStart);
        }

        public void shutdown (){
            isStart = false;
            System.out.println("Память " + isStart);
        }
    }

//    Создаем новые объекты i7 и transfer
    Proccessor i7 = new Proccessor();
    RAM transfer = new RAM();
}
