class Solution {
    public boolean checkString(String s) {
     //return !s.contains("ba");
   for(int i=1; i<s.length();++i){
     if(s.charAt(i-1)=='b' && s.charAt(i)=='a') return false;
   }
      return true;
    }
}