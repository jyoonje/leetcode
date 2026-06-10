class Solution {
    public List<String> letterCombinations(String digits) {

    if (digits.isEmpty())
      return new ArrayList<>();

    String[] map = {
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };

    List<String> result = new ArrayList<>();
    result.add("");

    for (char c : digits.toCharArray()) {

      List<String> next = new ArrayList<>();

      String letters = map[c - '0'];

      for (String s : result) {
        for (char ch : letters.toCharArray()) {
          next.add(s + ch);
        }
      }

      result = next;
    }

    return result;
  }
}