import java.util.*;

public class Main {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(findCommonLetters("abcde", "cccdefgh")));
  }

  static char[] findCommonLetters(String firstString, String secondString) {
    List<Character> buffer = new ArrayList<>();
    String firstToLOwer = firstString.toLowerCase();
    String secondToLower = secondString.toLowerCase();
    for (int i = 0; i < firstToLOwer.length(); i++) {
      for (int j = 0; j < secondToLower.length(); j++) {
        if(firstToLOwer.charAt(i) == secondToLower.charAt(j) && !buffer.contains(firstToLOwer.charAt(i))) {
          buffer.add(firstToLOwer.charAt(i));
        }
      }
    }
    return fillArray(buffer);
  }

  static char[] fillArray(List<Character> filler) {
    char toFill[] = new char[filler.size()];
    for (int i = 0; i < filler.size(); i++) {
      toFill[i] = filler.get(i);
    }
    return toFill;
  }
}
