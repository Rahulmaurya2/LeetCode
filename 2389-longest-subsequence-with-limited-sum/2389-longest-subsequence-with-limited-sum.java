class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
      Arrays.sort(nums);
      Arrays.parallelPrefix(nums,Integer::sum);
      for(int i=0; i<queries.length;i++){
        int pos= Arrays.binarySearch(nums,queries[i]+1);
        queries[i]=pos<0 ? ~pos:pos;
      }
      return queries;
      
      
      /*int []ans= new int[queries.length];
      int j=0;
      Arrays.sort(nums);
      for(int i=0;i<nums.length;i++){
        ans[j+1]= ans[j++]+nums[i];
        }

      return ans;
    }
  private int bs(int []a,int k){
    int s=0, e=a.length;
    while(s<e){
      int mid=s+(e-s)/2;
      if(a[mid]<=k){
        s=mid+1;
      }else{
        e=mid;
      }
    }
    return s;*/
      
  }
}