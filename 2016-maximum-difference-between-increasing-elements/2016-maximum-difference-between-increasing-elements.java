class Solution {
    public int maximumDifference(int[] nums) {
      int max=-1,min=nums[0];
      for(int i=0;  i<nums.length; i++){
        min=Math.min(min,nums[i]);
        if(min<nums[i]) max=Math.max(max,nums[i]-min);
      }
      return max;
    }
}