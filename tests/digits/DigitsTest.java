package digits;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DigitsTest {
  @Test
  public void isStrictlyIncreasing______0_ShouldBeTrue() {
    int num = 0;
    assertTrue((new Digits(num)).isStrictlyIncreasing());
  }

  @Test
  public void isStrictlyIncreasing______7_ShouldBeTrue() {
    int num = 7;
    assertTrue((new Digits(num)).isStrictlyIncreasing());
  }

  @Test
  public void isStrictlyIncreasing_____12_ShouldBeTrue() {
    int num = 12;
    assertTrue((new Digits(num)).isStrictlyIncreasing());
  }

  @Test
  public void isStrictlyIncreasing__1356_ShouldBeTrue() {
    int num = 1356;
    assertTrue((new Digits(num)).isStrictlyIncreasing());
  }

  @Test
  public void isStrictlyIncreasing_____11_ShouldBeFalse() {
    int num = 11;
    assertFalse((new Digits(num)).isStrictlyIncreasing());
  }

  @Test
  public void isStrictlyIncreasing__1336_ShouldBeFalse() {
    int num = 1336;
    assertFalse((new Digits(num)).isStrictlyIncreasing());
  }

  @Test
  public void isStrictlyIncreasing__1536_ShouldBeFalse() {
    int num = 1536;
    assertFalse((new Digits(num)).isStrictlyIncreasing());
  }

  @Test
  public void isStrictlyIncreasing_65310_ShouldBeFalse() {
    int num = 65310;
    assertFalse((new Digits(num)).isStrictlyIncreasing());
  }
}