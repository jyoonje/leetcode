public class Solution {

  public String convert(String s, int numRows) {

    if (numRows == 1) return s;

    String[][] matrix = new String[numRows][s.length()];

    int start = 0;

    int stringLength = 0;
    int columnIdx = 0;

    while(stringLength < s.length()){   // 문자열 끝날 때까지 반복
      while (start < numRows && stringLength < s.length()) {
        matrix[start][columnIdx] = String.valueOf(s.charAt(stringLength));
        start++;
        stringLength++;
      }

      start--;

      while (start > 0 && stringLength < s.length()) {
        start--;
        columnIdx++;
        matrix[start][columnIdx] = String.valueOf(s.charAt(stringLength));
        stringLength++;
      }
      start++;
    }

    // 만들어진 2차원 배열에서, 문자열 전부 더하기
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] != null) {
          sb.append(matrix[i][j]);
        }
      }
    }

    System.out.println(sb.toString());
    return sb.toString();
  }

}
