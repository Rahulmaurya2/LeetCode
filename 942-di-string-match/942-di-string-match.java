class Solution {
    public int[] diStringMatch(String s) {
      int []arr=new int[s.length()+1];
      int i=0;
      int j=s.length();
      for(int k=0; k<arr.length-1; k++){
        if(s.charAt(k)=='I'){
          arr[k]=i;
          i++;
        }else{
          arr[k]=j;j--;
        }
      }
      arr[arr.length-1]=i;
      return arr;
    }
}