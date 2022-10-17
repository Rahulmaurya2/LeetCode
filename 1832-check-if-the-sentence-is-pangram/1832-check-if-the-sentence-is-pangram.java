class Solution {
    public boolean checkIfPangram(String s) {  
     /*char []chr =s.toCharArray();
       Arrays.sort(chr);
       String str= String.valueOf(chr);
      return ("abcdefghijklmnopqrstuvwxyz").contains(str);
    */
      if(s.length()<26) return false;
      for(char i='a'; i<='z';i++){
        if(s.indexOf(i)==-1) return false;
      }
      return true;
    }
}