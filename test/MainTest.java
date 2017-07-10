import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
  @org.junit.jupiter.api.Test
  void findCommonLettersTestFindsOne() {
    assertEquals('d', Main.findCommonLetters("abcd", "def")[0]);
  }

  @Test
  void findCommonLettersTestFindsThird() {
    assertEquals('f', Main.findCommonLetters("abcdefgh", "defghjkl")[2]);
  }

  @Test
  void findThirdOutOfOrder() {
    assertEquals('c', Main.findCommonLetters("abcd", "cdba")[2]);
  }
  
}