package ru.stqa.pft.sandbox;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
  public static void main (String[] args) throws Exception{
//    Вывести текущею дату и время
//    Date date = new Date();
//    Вывести 1 января 1970 - начала эпохи Unix - Date(0) те 0 секунд с той даты
    Date date = new Date();
    System.out.println(date);

//    календарь приватный, но можем получить содержимое
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
//    Вывести дату и время + 1 неделю
    calendar.add(Calendar.WEEK_OF_MONTH,1);
    System.out.println(calendar.getTime());

//    Вывести дату в определенном формате. DateFormat так же приватный. но можем использовать
    DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
    System.out.println(dateFormat.format(calendar.getTime()));

//    Вывести дату в определенном формате
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println(simpleDateFormat.format(calendar.getTime()));

//    Что бы распарсить формат в стандартный Date (например 20/10/2019)
    Date newDate = simpleDateFormat.parse("20/10/2019");
    System.out.println(newDate);

//    20.10.19 18:31:54 + 20 секунд или date - текущая дата и время

    System.out.println(date);
    calendar.add(Calendar.SECOND, 20);
    System.out.println(calendar.getTime());
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
  }
}
