void moveZeroes(vector<int>& nums) {
int n = nums.size();
int left = 0;
for (int i: nums)
if (i != 0)
nums[left++] = i;
​
while (left < n) nums[left++] = 0;
}