class Solution {
    public boolean isPalindrome(int x) {
    if (x < 0) return false;

    String s = String.valueOf(x);
    int left = 0, right = s.length() - 1;
    while (left < right) {
      // 같은지
      if (s.charAt(left) == s.charAt(right)) {
        left++;
        right--;
        continue;
      }

      // 다르면
      return false;
    }
    return true;
  }
}