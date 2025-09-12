package DAY9;

import java.util.*;

public class SortVowels {

  private boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c) != -1;
  }

  public String sortVowels(String s) {
    List<Character> vowels = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (isVowel(c)) {
        vowels.add(c);
      }
    }
    Collections.sort(vowels);

    StringBuilder str = new StringBuilder(s);
    int j = 0;

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (isVowel(ch)) {
        str.setCharAt(i, vowels.get(j));
        j++;

      }

    }

    s = str.toString();
    return s;

  }
}
