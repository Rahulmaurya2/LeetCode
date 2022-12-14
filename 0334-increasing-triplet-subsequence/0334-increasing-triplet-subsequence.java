class Solution {
   public boolean increasingTriplet(int[] nums) {
        int first=Integer.MAX_VALUE,sec=Integer.MAX_VALUE;
        for(int j:nums)
            if(j<=first) 
              first=j;
            else if(j<=sec) 
              sec=j;
            else return true;
        return false;
    }
}