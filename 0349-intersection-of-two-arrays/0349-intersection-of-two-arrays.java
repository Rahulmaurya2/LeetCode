class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      HashSet<Integer> num1=new HashSet<>();
      for(int i:nums1) num1.add(i);
      int []arr=new int[num1.size()];
      int count=0;
      for(int n: nums2){
        if(num1.remove(n)){
          arr[count++]=n;
        }
      }
      return Arrays.copyOfRange(arr,0,count);
    }
}