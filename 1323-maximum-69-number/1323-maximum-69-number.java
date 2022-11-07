class Solution {
    public int maximum69Number (int num) {
      /*int l=(int) (Math.log10(num)+1);  
      int []arr= new int[l];
      int i1=0;
      while(num!=0){
        int rem=num%10;
        arr[i1]=rem;
        num/=10;
      }
      int res=0;
      for(int i=0; i<arr.length;i++){
        if(arr[i]==6){
          arr[i]=9;
          break;}
      }
      for(int i=0;i<arr.length;i++){
        res=res*10+arr[i];
      }
     return res; */
      StringBuilder str= new StringBuilder();
      str.append(num);
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)!='9'){
          str.setCharAt(i,'9');
           break;
        }
      }
      return Integer.parseInt(str.toString());
      
    }
}