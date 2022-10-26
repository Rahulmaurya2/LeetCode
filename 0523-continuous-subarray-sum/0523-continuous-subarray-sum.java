class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
     Set<Integer> s=new HashSet();
      int sum1=0,sum2=0;
      for(int i:nums){
        sum1+=i;
        if(s.contains(sum1%k)) return true;
        sum1%=k;
        s.add(sum2);
        sum2=sum1;
      }
      return false;
    }
}