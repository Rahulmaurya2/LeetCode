class Solution {
    public int missingNumber(int[] arr){
     /* int i = 0;
      while (i < arr.length){
          int correct = arr[i];
          if (arr[i] < arr.length && arr[i]!=arr[correct]){
              swap(arr,i,correct);
          } else {
              i++;
          }
      }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
     void swap(int [] arr,int first, int second){
         int temp = arr[first];
         arr[first]=arr[second];
         arr[second]=temp;*/
     // Arrays.sort(arr);
      int res=0;
      for(int i=0; i<arr.length; i++){
          res+=i;
        res-=arr[i];
        
      } res+=arr.length;
      return res;
     }        
 }