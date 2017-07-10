import java.util.*;

public class Main {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(findCommonLetters("abcde", "cccdefgh")));
  }

  static char[] findCommonLetters(String firstString, String secondString) {
    List<Character> buffer = new ArrayList<>();
    for (int i = 0; i < firstString.length(); i++) {
      for (int j = 0; j < secondString.length(); j++) {
        if(firstString.charAt(i) == secondString.charAt(j) && !buffer.contains(firstString.charAt(i))) {
          buffer.add(firstString.charAt(i));
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
