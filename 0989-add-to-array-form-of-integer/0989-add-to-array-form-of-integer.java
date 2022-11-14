class Solution {
    public List<Integer> addToArrayForm(int[] arr, int k) {
      LinkedList<Integer> list=new LinkedList<>();
    int len=arr.length-1;
     while(len>=0 || k!=0){
      if(len>=0){
        k+=arr[len--];
      }
       list.addFirst(k%10);
       k/=10;
     }
      return list;
    }
}