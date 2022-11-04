class Solution {
public int findSpecialInteger(int[] arr) {
int count = 0;
int n= arr.length;
int prev = -1;
int req = n / 4;
for(int i : arr) {
if(i == prev) {
count++;
}
else {
prev = i;
count = 1;
}
if(count > req) {
return i;
}
}
return -1;
}
}