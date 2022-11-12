int n = 0;
for(int bit : nums) {
n = (n * 2 + bit) % 10;
divisibleByFive.add(n == 5 || n == 0);
}
return divisibleByFive;