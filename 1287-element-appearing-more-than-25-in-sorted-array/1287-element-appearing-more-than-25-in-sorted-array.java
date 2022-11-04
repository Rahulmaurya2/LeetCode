class Solution {
    public int findSpecialInteger(int[] arr) {
      //if(arr.length==1 || arr.length==0) return -1;
        int count=0 , j=-1;
        int k=arr.length/4;
       for(int i:arr){
         if(i == j) count++;
         else{
           j=i;
           count=1;
         }
         if(count>k) return i;
       }
      return -1;
    }
}