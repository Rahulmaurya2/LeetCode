class Solution {
    public int search(int[] nums, int t) {
     int start=0, end=nums.length-1;
      while(start<=end){
        int mid=start+(end-start)/2;
        if(t<nums[mid]) 
           end=mid-1;
        else if(t>nums[mid]) 
          start=mid+1;
        else return mid;
      }
      return -1;
    }
}