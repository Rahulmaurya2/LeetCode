class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
      int max=0;
      int[][] arr=new int[names.length][2];
      for(int i=0; i<names.length;i++){
        arr[i]= new int[]{heights[i],i};
      }
      Arrays.sort(arr,(a,b)->b[0]-a[0]);
      String[]res=new String[names.length];
      for(int i=0; i<names.length;i++)
        res[i]=names[arr[i][1]];
      return res;
    }
}