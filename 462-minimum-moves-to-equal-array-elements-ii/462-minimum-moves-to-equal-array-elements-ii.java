class Solution {
    public int minMoves2(int[] nums) {
     Arrays.sort(nums);
     // if(nums.length ==0 && nums.length ==1) return nums;
      int sum=0; int j=nums[nums.length/2];
      for(int i: nums){
        sum+=Math.abs(j-i);
      }
      return sum;
    }
}