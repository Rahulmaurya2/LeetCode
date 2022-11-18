class Solution {
public int findMaxK(int[] nums) {
Set<Integer> set = new HashSet<>();
for (int i = 0; i < nums.length; i++){
set.add(nums[i]);
}
int ans = -1;
for (int i = 0; i < nums.length; i++) {
if (nums[i] > ans && set.contains(-nums[i]))
ans = nums[i];
}
return ans;
}
}