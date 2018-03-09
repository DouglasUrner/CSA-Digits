public class DigitsMain {
  public static void main(String[] args) {
    Digits a = new Digits(12345);
    System.out.println("a: result should be 'true': " + a.isStrictlyIncreasing());

    Digits b = new Digits(54321);
    System.out.println("b: result should be 'false': " + b.isStrictlyIncreasing());

    Digits c = new Digits(0);
    System.out.println("c: result should be 'true': " + c.isStrictlyIncreasing());

    Digits d = new Digits(7);
    System.out.println("d: result should be 'true': " + d.isStrictlyIncreasing());

    Digits e = new Digits(12334);
    System.out.println("e: result should be 'false': " + e.isStrictlyIncreasing());
  }
}
