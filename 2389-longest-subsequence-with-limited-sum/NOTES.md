public int[] answerQueries(int[] nums, int[] queries) {
Arrays.sort(nums);
Arrays.parallelPrefix(nums, Integer::sum);
for (int i = 0; i < queries.length; ++i) {
int pos = Arrays.binarySearch(nums, queries[i] + 1);
queries[i] = pos < 0 ? ~pos : pos;
}
return queries;
}
​
public int[] answerQueries(int[] nums, int[] queries) {
int m = queries.length, n = nums.length, i = 0;
Arrays.sort(nums);
int[] prefixSum = new int[n + 1];
for (int num : nums) {
prefixSum[i + 1] = prefixSum[i++] + num;
}
i = 0;
int[] ans = new int[m];
for (int q : queries) {
ans[i++] = binarySearch(prefixSum, q) - 1;
}
return ans;
}
private int binarySearch(int[] a, int k) {
int lo = 0, hi = a.length;
while (lo < hi) {
int mid = lo + (hi - lo) / 2;
if (a[mid] <= k) {
lo = mid + 1;
}else {
hi = mid;
}
}
return lo;
}