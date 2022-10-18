class Solution {
    public String[] findRelativeRanks(int[] score) {
     /*   //Arrays.sort(score);
      String []str= new String[score.length];
      str[0]="Gold Medal";
      str[1]="Silver Medal";
      str[2]="Bronze Medal";
      for(int i=3; i<score.length; i++){
        /*if(score[i]) str[i]="Gold Medal";
        else if(score[i]==2) str[i]="Silver Medal";
        else if(score[i]==3) str[i]="Bronze Medal";
        str[i]=Integer.toString(i+1);
      }
      return str;*/
      String[] res = new String[score.length];
      PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->score[b]-score[a]);
     for(int i=0; i<score.length; i++) pq.add(i);
     int i=1;
     while(!pq.isEmpty()){
       int idx=pq.poll();
       if(i>3) res[idx]=Integer.toString(i);
       else if(i==1) res[idx]="Gold Medal";
       else if(i==2) res[idx]="Silver Medal";
       else if(i==3) res[idx]="Bronze Medal";
       i++;
     }
      return res;
    }
}