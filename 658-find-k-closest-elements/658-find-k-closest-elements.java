class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
      List<Integer> list = new ArrayList<>();
     /* int j=arr.length;
      for(int i=0; i<arr.length;i++){
        if(i<k && k>x){
          list.add(arr[i]);
        }
       if(x<arr[i] && i<arr.length-k-1){
         list.add(arr[i]);
       }
      }*/
      int start=0;
      int end=arr.length-1;
      while(end-start>=k){
        int distStart=Math.abs(arr[start]-x);
        int distEnd= Math.abs(arr[end]-x);
        if(distStart<=distEnd)
          end--;
        else 
          start++;
      }
      while(start<=end){
        list.add(arr[start++]);
      }
      return list;
      
    }
}