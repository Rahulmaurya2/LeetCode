class Solution {
   static final String vo="aeiouAEIOU";
    public String reverseVowels(String s) {
      /*char [] ch= s.toCharArray();
      int j=ch.length-1;
      for(int i=0; i<ch.length;i++){
       if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i' || ch[i]=='o'|| ch[i]=='u'){
         char temp = ch[i];
         ch[i]=ch[j];
         ch[j]=temp;
       }
     }
      //String str="";
      //for(int i=0; i<ch.length;i++){
        //str+=String.valueOf(ch[i]);
      //}
      return new String(ch);*/
      
      char[] ch=s.toCharArray();
      int i=0;
      int j=s.length()-1;
      
      while(i<j){
        while(i<j && vo.indexOf(ch[i])==-1){
          i++;
      }
      while( i<j && vo.indexOf(ch[j])==-1){
        j--;
      }
      char temp = ch[i];
      ch[i]=ch[j];
      ch[j]=temp; 
      i++;j--;}
      return new String(ch);
    }
}