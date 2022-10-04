class Solution {
    public void moveZeroes(int[] nums) {
      //Arrays.sort(nums);
      int i1=0;
      int j=nums.length;
      for(int i:nums){
        if(i!=0) nums[i1++] =i;
      }
      while(i1<j) nums[i1++]=0;
    }
}