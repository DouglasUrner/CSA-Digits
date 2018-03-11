package digits;

import java.util.Scanner;

public class DigitsMain {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    while (true) {
      System.out.print("Enter Digits: ");
      String str = stdin.next();
      if (str.equalsIgnoreCase("quit")) break;
      System.out.printf("'%s' %s strictly increasing\n", str,
              (new Digits(Integer.parseInt(str))).isStrictlyIncreasing() ? "is" : "is not");
    }
  }
}
