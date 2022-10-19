class Solution {
    public int findDuplicate(int[] nums) {
     /* Arrays.sort(nums);
      int res=0;
      for(int i=0; i<nums.length-1; i++){
        if(nums[i]==nums[i+1]) res=nums[i];
      }
      return res; */
      HashSet<Integer> set=new HashSet<>();
      for(int i=0; i<nums.length; i++){
        if(!set.add(nums[i])) return nums[i];
      }
      return -1;
    }
}