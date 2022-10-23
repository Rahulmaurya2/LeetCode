class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[]a= arr.clone();
        Arrays.sort(a);
      Map<Integer, Integer> map=new HashMap<>();
      for(int i=0; i<a.length; i++){
       map.putIfAbsent(a[i],map.size()+1);
      }
      for(int i=0; i<a.length; i++){
        a[i]=map.get(arr[i]);
      }
      return a;
    }
}