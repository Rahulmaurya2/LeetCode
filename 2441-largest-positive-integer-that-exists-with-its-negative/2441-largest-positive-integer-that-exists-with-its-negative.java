class Solution {
    public int findMaxK(int[] nums) {
     HashSet<Integer> set= new HashSet<>();
      for(int i:nums) set.add(i);
      
      int ans=-1;
      for(int i=0;i<nums.length;i++){
        if(nums[i]>ans && set.contains(-nums[i])) ans=nums[i];
      }
      return ans;
    }
}