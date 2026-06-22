class Solution {
   public int removeElement(int[] nums, int val) {
    int i = 0;

    for(int j = 0; j < nums.length; j++){
      if(nums[j] != val){
        i++;
      }
      else{
        int k = j + 1;
        if(k>=nums.length){
          break;
        }
        while(k < nums.length){
          if(nums[k] == val){
            k++;
          }
          else{
            int temp = nums[j];
            nums[j] = nums[k];
            nums[k] = temp;
            i++;
            break;
          }
        }
      }
    }
    return i;
  }
}