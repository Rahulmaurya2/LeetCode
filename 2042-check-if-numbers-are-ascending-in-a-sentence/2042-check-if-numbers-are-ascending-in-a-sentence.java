class Solution {
    public boolean areNumbersAscending(String s) {
        int pre=0; 
      for(String i: s.split(" ")){
        try{
          int num = Integer.parseInt(i);
          if(num<=pre) return false;
          pre=num;
        }
        catch(Exception e){}
      }
      return true;
    }
}