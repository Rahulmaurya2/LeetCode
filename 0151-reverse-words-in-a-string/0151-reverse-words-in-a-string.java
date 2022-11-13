class Solution {
    public String reverseWords(String s) {
      String []word=s.split(" ");
      StringBuilder str = new StringBuilder();
     for(int i=0;i<word.length;i++){
       if(!word[i].isEmpty()){
         str.insert(0,word[i]);
         if(i<word.length-1) str.insert(0," ");
       }
     }
      return str.toString();
    }
}