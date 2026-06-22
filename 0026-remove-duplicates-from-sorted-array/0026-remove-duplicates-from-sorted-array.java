class Solution {
    public int removeDuplicates(int[] nums) {

    if(nums.length == 1) return 1;

    int prev = nums[0];

    for(int i = 1; i < nums.length; i++) {
      if(i == nums.length - 1 && nums[i] == prev) {
        break;
      }

      if(!(nums[i] > prev)) {
        int point = i + 1;
        while(point < nums.length) {
          if(!(nums[point] > prev)) point++;
          else {
            nums[i] = nums[point];
            break;
          }
        }
      }
         prev = nums[i];
    }

    int k = 1;
    for(int i =1; i < nums.length; i++) {
      if(nums[i] <= nums[i-1]) break;
      else k++;
    }

    return k;
  }
}