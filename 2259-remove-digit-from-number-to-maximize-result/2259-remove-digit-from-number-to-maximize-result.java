class Solution {
    public String removeDigit(String s, char digit) {
       // return number.replaceLast(digit+"","");
    String str="";
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)==digit){
          String t=s.substring(0,i)+s.substring(i+1);
          if(t.compareTo(str)>0) str=t;
        }
      }
      return str;
    }
}