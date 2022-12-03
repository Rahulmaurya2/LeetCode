class Solution {
public int firstUniqChar(String s) {
   HashMap <Character, Integer> ans = new HashMap <>();

    //go through the whole string, record the frequency of each letter
   /* for (int i = 0; i < s.length(); i ++){
        char c = s.charAt(i);
        if(ans.containsKey(c)){
            ans.put(c,ans.get(c) + 1);
        }
        else{
            ans.put(c, 1);
        }
    }*/
  for(char c: s.toCharArray()){
    ans.put(c,ans.getOrDefault(c,0)+1);
  }
    
    //return the first letter that has frequency of 1
    for (int i = 0; i < s.length(); i ++){
       // char c = s.charAt(i);
        if (ans.get(s.charAt(i)) == 1) return i;
        
    }
    return -1;
       
  }
}