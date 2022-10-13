class Solution {
    public int maximumProduct(int[] nums) {
      Arrays.sort(nums);
      int max = nums[0]*nums[1]*nums[nums.length-1];
      for(int i=0; i<nums.length-2; i++){
        max=Math.max(nums[i]*nums[i+1]*nums[i+2],max);
      }
      return max;
    }
}