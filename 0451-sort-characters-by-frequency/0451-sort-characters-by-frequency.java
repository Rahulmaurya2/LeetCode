class Solution {
    public String frequencySort(String s) {
     
    HashMap<Character , Integer> hm= new HashMap<>();
    for(int i=0; i<s.length();i++){
      hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
    }
    List<Character> ch= new ArrayList(hm.keySet());
    Collections.sort(ch,(a,b)->(hm.get(b)-hm.get(a)));
      
    StringBuilder str= new StringBuilder();
      for(Object c: ch){
        for(int i=0; i<hm.get(c);i++) str.append(c);
      }
      return str.toString();
    }
}