package ru.stqa.pft.sandbox;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
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

//    Часовой пояс омска (еще подумать нужно)
//    ZoneId Omsk = ZoneId.of("UTC+6");
//    ZonedDateTime OmskTime = ZonedDateTime.now(Omsk);
//    System.out.println(OmskTime);
//
//    LocalDate today = OmskTime.toLocalDate();
//    LocalTime tenPM = LocalTime.of(22,0);
//    ZonedDateTime tenPMToday = ZonedDateTime.of(today,tenPM,Omsk);
//    System.out.println(today);
//    System.out.println(tenPMToday);

//    20.10.19 18:31:54 + 20 секунд или date - текущая дата и время
//Предусловие
    System.out.println(date);
    Calendar newcalendar = Calendar.getInstance();
    newcalendar.setTime(date);
    newcalendar.add(Calendar.SECOND, 20);
    System.out.println(newcalendar.getTime());

//    Черновик
//    Duration duration = Duration.between(date, newcalendar);
//    long diff = Math.abs(duration.toMinutes());
//    System.out.println(diff);
//
//    long diff = ChronoUnit.SECONDS.between(now, tenSecondsLater);
//    assertEquals(diff, 10);
//
//    long days = Period.between(date, newDate).getDays();
//    System.out.println("No of days: " + days);
//    assertEquals(diff, 20);
//
//    int daysDiff;
//    daysDiff = newcalendar.getTime() - date.getTime();
//
//    int TimeUnit = 20;
//
//    public long getDays(Date date, Date newcalendar)
//    {
//      long l = newcalendar.getTime() - date.getTime();
//      return TimeUnit.DAYS.convert(l, TimeUnit.MILLISECONDS);
//    }
//
//    Days diff = Days.daysBetween(date, newcalendar);
//    System.out.println(diff.getDays());
//
//    boolean b;
//
//    if (date.getTime() < newcalendar.getTime()) {
//      b = true;
//    } else b = false;
//    System.out.println(b);

  }
}
