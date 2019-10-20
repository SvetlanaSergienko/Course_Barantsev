package ru.stqa.pft.sandbox;

import javax.xml.crypto.Data;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTime {

  public static void main(String[] args) throws InterruptedException {

//      Вывести текущую дату и время
    Date date = new Date();
    System.out.println(date);

//     1212121212121L - секунды от 01.01.1970
    Date date2 = new Date(1212121212121L);
    System.out.println(date2);

    Thread.sleep(2000);//таймаут - приостановим работу программы на 2 секунды

//      Сравнение 2х дат
    System.out.println((date.getTime() > date2.getTime()) ?
            "date позже date2" : "date раньше date2");

//      Метод before() возвращает boolean проверяет, была ли date раньше той, которую мы передаем в качестве аргумента date2
//      Метод after возвращает boolean  date больше аргумерта date2
//      Метод equals возвращает boolean  даты равны до милесекунд
    System.out.println(date.before(date2));
    System.out.println(date.after(date2));
    System.out.println(date.equals(date2));

    DateTime dateNew = new DateTime();
    int differenceHours = 3;


    // ZonedDateTime
    LocalDate ld = LocalDate.of( 2017 , Month.MARCH , 12 ) ;
    LocalTime lt = LocalTime.of( 1 , 0 ) ;
    ZoneId z = ZoneId.of("Europe/Moscow");
    ZonedDateTime zdt = ZonedDateTime.of( ld , lt , z ) ;
    ZonedDateTime zdtOneHourLater = zdt.plusHours( 1 ) ;

    System.out.println( "zdt: " + zdt ) ;
    System.out.println( "zdtOneHourLater: " + zdtOneHourLater ) ;
    System.out.println( "1 час плюс 3 часа утра? летнее время Daylight Saving Time (DST)" ) ;
    System.out.println( "" ) ;

    Instant instant = zdt.toInstant() ;  // Отрегулируйте в UTC.
    Instant instantOneHourLater = instant.plus( 1 , ChronoUnit.HOURS ) ;

    System.out.println( "instant: " + instant ) ;
    System.out.println( "instantOneHourLater: " + instantOneHourLater ) ;
    System.out.println( "Instant всегда в UTC. Добавление часа к 1 AM приводит к 2 AM каждый раз") ;

//    public void addToDateTimeHours (String variableName, String dateValue,int differenceHours){
//      DateTime dateSrc = DateTime.parse(TestVariables.replaceAllVariables(dateValue), DEFAULT_DATE_TIME_FORMATTER);
//      DateTime newDate = dateSrc.plusHours(differenceHours);
//      String newDateText = newDate.toString(DEFAULT_DATE_TIME_FORMATTER);
//      TestVariables.saveVariable(variableName, newDateText);


    }


}
