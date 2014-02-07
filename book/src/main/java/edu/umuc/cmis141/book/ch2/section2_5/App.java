
package edu.umuc.cmis141.book.ch2.section2_5;

public class App {

  private static String testNotInit;

  private App() {
    // Not used.
  }

  public static void main(final String[] args) {
    System.out.println(printMessageOK());
  }

  /**
   * Class variables don't need to be initialized before being used.
   */
  public static String printMessageOK() {
    return testNotInit;
  }

  /**
   * Uncomment the method body to cause compiler error.
   */
  /*public static String printMessageError() {
    String notInited;
    return notInited;
  }*/
}