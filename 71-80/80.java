class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int index = 0, count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[index]) {
                if (count < 2) {
                    count++;
                    nums[++index] = nums[i];
                }
            } else {
                nums[++index] = nums[i];
                count = 1;
            }
        }
        return index + 1;
    }
}
