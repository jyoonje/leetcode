public class Solution {

  public String convert(String s, int numRows) {

    if (numRows == 1) return s;

    char[][] matrix = new char[numRows][s.length()];

    int start = 0;

    int stringLength = 0;
    int columnIdx = 0;

    while(stringLength < s.length()){   // 문자열 끝날 때까지 반복
      while (start < numRows && stringLength < s.length()) {
        matrix[start][columnIdx] = s.charAt(stringLength);
        start++;
        stringLength++;
      }

      start--;

      while (start > 0 && stringLength < s.length()) {
        start--;
        columnIdx++;
        matrix[start][columnIdx] = s.charAt(stringLength);
        stringLength++;
      }
      start++;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] != '\0') {
          sb.append(matrix[i][j]);
        }
      }
    }

    System.out.println(sb.toString());
    return sb.toString();
  }

}
