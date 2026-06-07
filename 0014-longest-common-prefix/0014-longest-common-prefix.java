class Solution {
    public String longestCommonPrefix(String[] strs) {
    String firstStr = strs[0];
    String[] keyword = firstStr.split("");

    StringBuilder answer = new StringBuilder();

    for(int j = 0; j < keyword.length; j++) {
      boolean exist = true;
      for(int k = 1; k < strs.length; k++) {
        if(!strs[k].startsWith(keyword[j])) {
          exist = false;
          return answer.toString();
        }
       if(strs[k].length() > 0) {
          strs[k] = strs[k].substring(1);  
        }
        
      }
      if(exist) {answer.append(keyword[j]);}
    }

    return answer.toString();


  }
}