class Solution {
    public int longestNiceSubarray(int[] nums) {
      int use=0,j=0,res=0;
      for(int i=0; i<nums.length;++i){
        while((use&nums[i])!=0){
          use^=nums[j++];
        }
          use|=nums[i];
          res=Math.max(res,i-j+1);
      }
      return res;
    }
}