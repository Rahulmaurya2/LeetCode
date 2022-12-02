class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        Map<Character, Integer> hm1= new HashMap<>();
        for(char c:word1.toCharArray()){
          hm1.put(c,hm1.getOrDefault(c,0)+1);
        }
      Map<Character, Integer> hm2= new HashMap<>();
      for(char c:word2.toCharArray()){
        hm2.put(c,hm2.getOrDefault(c,0)+1);
      }
      if(!hm1.keySet().equals(hm2.keySet())) return false;
      
      List<Integer> list1= new ArrayList<>(hm1.values());
      List<Integer> list2= new ArrayList<>(hm2.values());
      Collections.sort(list1);
      Collections.sort(list2);
      
      return list1.equals(list2);
    }
}