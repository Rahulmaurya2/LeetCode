class Solution {
    public int heightChecker(int[] h) {
      int count=0;
      int []arr = Arrays.copyOf(h,h.length);
      Arrays.sort(arr);
      for(int i=0; i<h.length; i++){
        if(arr[i]!=h[i]) count++;
      }
      return count;
    }
}