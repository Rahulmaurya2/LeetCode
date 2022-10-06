class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
      List<Integer> ans = new ArrayList<>();
      int[] arr= new int[101];
      for(int i: nums1){
        if(arr[i]==0) arr[i]=1;
      }
      for(int i:nums2){
        if(arr[i]==0) arr[i]=2;
        else if(arr[i]==1) {
          ans.add(i);
          arr[i]=-1;}
      }
      for(int i:nums3){
        if(arr[i]==1 || arr[i]==2){
          ans.add(i);
          arr[i]=-1;}
      }
      return ans;
    }
}