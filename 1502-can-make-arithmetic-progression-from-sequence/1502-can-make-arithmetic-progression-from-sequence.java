class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
       int sum=Math.abs(arr[0]-arr[1]);
      for(int i=2; i<arr.length;i++){
        if(sum!=Math.abs(arr[i-1]-arr[i])) return false;

      }
      return true;
    }  
}