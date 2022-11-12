class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list= new ArrayList<>();
      int n=0;
       for(int i=0; i<nums.length;i++){
        n=(n*2+nums[i])%10;
         list.add(n==5 || n==0);
      }
      return list;
    }
}