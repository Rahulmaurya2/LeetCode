class Solution {
    public int maximumUnits(int[][] boxtypes, int truckSize) {
      //Arrays.sort(boxtypes,(a,b)->Integer.compare(a[0],b[0])); 
      Arrays.sort(boxtypes,(a,b)->b[1]-a[1]);
      int ans=0;
      for(int i=0; i<boxtypes.length; i++){
       int  size=Math.min(boxtypes[i][0],truckSize);
       ans=ans+(size*boxtypes[i][1]);
       truckSize-=size;
          if(truckSize==0) return ans;
        }
      
      return ans;
    }
}