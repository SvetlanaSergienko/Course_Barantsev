package oop;

//Вложенные и ананимные классы.
// Вложеные классы это например класс компьютер состоит из процессора и памяти.
// Всегда и только этот класс
// но напрмер люди не состоят из студентов. Редко на практике используют

public class NestedAnonymousMain {
    public static void main (String[] args) {


//        NestedAnonymousComputer comp = new NestedAnonymousComputer();
////        Обратиться к объекту comp,к объекту i7 и включить метод start
//        comp.i7.srart();
//        comp.transfer.srart();
//
//        comp.i7.shutdown();
//        comp.transfer.shutdown();

//    Анонимный класс нужен, если
//    1. тело класса короткое
//    2. нужен только один экхемпляр класса
//    3. класс используется в месте создания или вместо его
//    4. имя класса не важно и не облягчает понимание кода

//        анонимный класс без "NestedAnonymousComputer comp ="
//        обязательно закрывается };
        new NestedAnonymousComputer(){
            void supercomp(){
                this.i7.srart();
                this.transfer.shutdown();
            }
        };
    }
}
