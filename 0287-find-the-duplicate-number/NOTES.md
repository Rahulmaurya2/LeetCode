Set<Integer> set = new HashSet<>();
int len = nums.length;
for (int i = 0; i < len; i++)
if (!set.add(nums[i]))
return nums[i];
​
return -1;
}