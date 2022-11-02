class Solution {
    public int numJewelsInStones(String j, String stones) {
       //return stones.replaceAll("[^"+j+"]","").length();
    int count=0;
      for(int i=0;i<stones.length();i++){
        if(j.indexOf(stones.charAt(i))!=-1) count++;
      }
      return count;
    }
}