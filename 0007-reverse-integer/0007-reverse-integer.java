class Solution {
    public int reverse(int x) {
    // -2,147,483,648 ~ 2,147,483,647
    
    int reverse = 0;
    
    while (x != 0) {
      
      if(reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && x % 10 > 7)) return 0;
      if(reverse < Integer.MIN_VALUE / 10 || reverse < Integer.MIN_VALUE / 10 && x % 10 < - 8) return 0;
      
      reverse = reverse * 10 + x % 10;
      x = x / 10;
    }
    
    return reverse;
  }
}