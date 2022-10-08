class Solution { //Fast than 100%
public boolean isThree(int n) {
for (int i = 2; i * i <= n; i++) {
if (n % i == 0) {
return i * i == n;  // Ex: 4,9,16,25,49,121...
}
}
return false;
}
}