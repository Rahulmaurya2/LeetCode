class Solution {
public int[][] intervalIntersection(int[][] A, int[][] B) {
int i=0;
int j=0;
List<int[] > list=new ArrayList<>();
while(i<A.length && j<B.length){
int lower=Math.max(A[i][0],B[j][0]);
int upper=Math.min(A[i][1],B[j][1]);
if(lower<=upper){
list.add(new int[]{lower,upper});
}
if(A[i][1]<B[j][1]){
i++;
}else{
j++;
}
​
​
}
return list.toArray(new int[list.size()][]);
}
}
class Solution {
public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
if(firstList.length==0 || secondList.length==0) return new int[0][0];
int i = 0;
int j = 0;
int startMax = 0, endMin = 0;
List<int[]> ans = new ArrayList<>();
while(i<firstList.length && j<secondList.length){
startMax = Math.max(firstList[i][0],secondList[j][0]);
endMin = Math.min(firstList[i][1],secondList[j][1]);
//you have end greater than start and you already know that this interval is sorrounded with startMin and endMax so this must be the intersection
if(endMin>=startMax){