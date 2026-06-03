class Solution {
      public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    int[] sumNums = new int[nums1.length + nums2.length];

    for(int i = 0; i < nums1.length; i++) sumNums[i] = nums1[i];
    for(int i = 0; i < nums2.length; i++) sumNums[nums1.length + i] = nums2[i];
    Arrays.sort(sumNums);

    int length = sumNums.length;

    if(length % 2 == 0) return (double) (sumNums[length / 2 - 1] + sumNums[length / 2]) / 2.0;
    return (double) sumNums[length/2];
  }
}