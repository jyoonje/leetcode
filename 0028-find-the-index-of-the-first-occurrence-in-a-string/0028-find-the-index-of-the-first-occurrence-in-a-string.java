class Solution {
  public int strStr(String haystack, String needle) {
    if (haystack.length() < needle.length()) return -1;

    char c = needle.charAt(0);
    for(int i=0; i<haystack.length(); i++) {
      if(haystack.charAt(i) == c) {
        if(i+needle.length() > haystack.length()) {
          return -1;
        }
        String letter = "";
        for(int j=i; j<i+needle.length(); j++) {
          letter += haystack.charAt(j);
        }
        if(letter.equals(needle)) {
          return i;
        }
      }
    }
    return -1;
  }
}
