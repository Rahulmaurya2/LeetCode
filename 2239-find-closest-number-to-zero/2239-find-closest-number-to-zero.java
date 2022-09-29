class Solution {
    public int findClosestNumber(int[] nums) {
     int ans=Integer.MAX_VALUE;
      for(int i: nums){
        if(Math.abs(i)<= Math.abs(ans) && Math.abs(i) != ans) ans =i;
      }
      return ans;
    }
}