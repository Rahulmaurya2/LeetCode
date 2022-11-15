class Solution {
    public int distinctAverages(int[] nums) {
      Arrays.sort(nums);
      HashSet<Float> set = new HashSet<>();
      float avg=0 ;int count=0;
      int j=nums.length-1;
      for(int i=0;i<nums.length;i++){
        avg=(float)(nums[i]+nums[j])/2;
        j--;
       set.add(avg);
      }
      return set.size();
    }
}