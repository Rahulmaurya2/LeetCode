class Solution {
    public int[] sortArray(int[] nums) {
     divide(nums,0,nums.length-1);
      return nums;
    }
  public void divide(int []nums, int start, int end){
    if(start<end){
      int mid=start+(end-start)/2;
      divide(nums, start,mid);
      divide(nums, mid+1,end);
      merge(nums,start, mid,end);
      
    }
  }
  
  public void merge(int []nums, int start, int mid, int end){
    int i=start, j=mid+1 , k=0;
    int[] temp = new int[end-start+1];
    while(i<=mid && j<=end){
      if(nums[i]<nums[j]) 
        temp[k++]=nums[i++];
      else 
        temp[k++]=nums[j++];
      
    }
    while(i<=mid){
      temp[k++]=nums[i++];
    }
    while(j<=end){
      temp[k++]=nums[j++];
    }
    //nums=Arrays.copyOf(0,temp.length);
    for(int i1=start; i1<=end; i1++){
          nums[i1]=temp[i1-start];}
    }
}