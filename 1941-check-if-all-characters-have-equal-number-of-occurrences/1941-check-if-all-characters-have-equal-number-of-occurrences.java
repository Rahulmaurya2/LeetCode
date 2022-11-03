class Solution {
    public boolean areOccurrencesEqual(String s) {
     if(s.length()==1) return true;
      Map<Character,Integer> map=new HashMap<>();
      for(char ch:s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
      }
      int f=map.get(s.charAt(0));
      for(char key:map.keySet()){
        if(map.get(key)!=f) return false;
      }
return true;
    }
}