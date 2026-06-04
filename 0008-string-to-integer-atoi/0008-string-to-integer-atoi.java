class Solution {
    public int myAtoi(String s) {
    s = s.trim();

    boolean isPositive = true;
    if (s.startsWith("+") || s.startsWith("-")) {
      char first = s.charAt(0);
      s = s.substring(1);
      if (first == ('-')) isPositive = false;
    }

    int answer = 0;
    for(int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c >= '0' && c <= '9') {
        int digit = c - '0';
        if(isPositive && (answer > Integer.MAX_VALUE / 10 || (answer == Integer.MAX_VALUE / 10 && digit > 7))) return Integer.MAX_VALUE;
        if(!isPositive && (answer > Integer.MAX_VALUE / 10 || (answer == Integer.MAX_VALUE / 10 && digit > 7))) return Integer.MIN_VALUE;

        answer = answer * 10 + digit;
      } else {
        break;
      }
    }

    if (isPositive) return answer;
    else return answer * -1;
  }
}