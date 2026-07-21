package Bosscoder_Module_1.BegineerModule.Session_7_String_31_May;

public class CountPairsOfSimilarStrings {

  static public boolean isSame(String a, String b) {

    boolean[] arr = new boolean[26];
    boolean[] brr = new boolean[26];
    for (int i = 0; i < a.length(); i++) {
      arr[(int) a.charAt(i) - 97] = true;
    }
    for (int i = 0; i < b.length(); i++) {
      brr[(int) b.charAt(i) - 97] = true;
    }

    for (int i = 0; i < 26; i++) {
      if (arr[i] != brr[i]) {
        return false;
      }
    }
    return true;
  }

  static public int countPair(String[] words) {
    // int count = 0;
    boolean[] pair = new boolean[words.length];
    int ans = 0;
    for (int i = 0; i < words.length; i++) {
      String currentStr = words[i];

      if (pair[i] == false) {
        pair[i] = true;
        int count = 1;

        for (int j = i + 1; j < words.length; j++) {
          if (isSame(currentStr, words[j])) {
            count++;
            pair[j] = true;
          }

        }
        ans = ans + (count * (count - 1)) / 2;
      }
    }
    return ans;

  }

  public static void main(String[] args) {
    String[] words = { "aba", "aabb", "abcd", "bac", "aabc" };
    System.out.println(countPair(words));

  }

}
