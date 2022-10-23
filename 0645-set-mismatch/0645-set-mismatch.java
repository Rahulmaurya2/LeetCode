class Solution {
    public int[] findErrorNums(int[] nums) {
     /* Arrays.sort(nums);  
      int [] arr= new int[nums.length];
      int j=1;
      for(int i=0;i<nums.length-1; i++){
        if(nums[i]==nums[j++]){
          arr[i]=nums[i];
          arr[++i]=nums[i]+1;
        }
      }
      for(int i=0; i<nums.length; i++){
        if(nums[i]==0) i+=2;
      }
      return arr;*/
      int n=nums.length, sum=n*(n+1)/2;
      int ans[] = new int[2];
      boolean[]seen=new boolean[n+1];
      for(int num:nums){
        sum-=num;
        if(seen[num]) ans[0]=num;
        seen[num]=true;
      }
      ans[1]=sum+ans[0];
      return ans;
    }
}