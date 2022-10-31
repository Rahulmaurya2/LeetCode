class Solution {
    public String bestHand(int[] ranks, char[] suits) {
      /*int count=1 ,res=1;
      for(int i=1; i<ranks.length; i++){
        if(suits[i-1]==suits[i])  res++;
        if(ranks[i-1]==ranks[i]) count++;
      }
      if(res == 5) return "Flush";
      else if((count==4||res==4) || (count==3)) return "Three of a Kind";
      else if(count==2 || res==2) return "Pair";
      else return "High Card";*/
      int m=0,s=0;
      char ch=suits[0];
      int []arr=new int[14];
      for(int i=0;i<ranks.length;i++){
        arr[ranks[i]]++;
        m=Math.max(m,arr[ranks[i]]);
        if(suits[i]==ch) s++;
      }
      if(s==5) return "Flush";
      return m>=3?"Three of a Kind":(m==2?"Pair":"High Card");
    }
}