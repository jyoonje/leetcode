class Solution {
    public int maxArea(int[] height) {

    int left = 0, right = height.length - 1;
    int maxArea = Math.min(height[left], height[right]) * (right - left);
    if (height.length == 2) return maxArea;
    int currentArea = 0;

    while (left < right) {
     if (height[left] < height[right]) {
         left++;
         if (right == left) break;
         currentArea = Math.min(height[left], height[right]) * (right - left);
         maxArea = Math.max(maxArea, currentArea);
     } else {
         right--;
         if (right == left) break;
         currentArea = Math.min(height[left], height[right]) * (right - left);
         maxArea = Math.max(maxArea, currentArea);
     }
    }

    return maxArea;
  }
}