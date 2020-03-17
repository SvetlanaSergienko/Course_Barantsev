package youtube;

public class Color {
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

  public static void main(String[] args) {

//    Первый способ
//    Warning красным
//    30 - черный. 31 - красный. 32 - зеленый. 33 - желтый. 34 - синий. 35 - пурпурный. 36 - голубой. 37 - белый.
    System.out.println((char) 27 + "[31mWarning! " + (char) 27 + "[0m");

//  Второй способ
    System.out.println(ANSI_BLUE + "This text is BLUE!" + ANSI_RESET);
    System.out.println("\u001B[32m" + "This text is GREEN!" + "\u001B[0m");

  }

}
