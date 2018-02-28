class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);

        while (n != 1) {
            int sum = 0;
            while(n != 0) {
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            if (set.contains(sum)) {
                return false;
            }
            set.add(sum);
            n = sum;
        }
        return true;
    }
}
