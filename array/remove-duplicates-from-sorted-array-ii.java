class Solution {
    public int removeDuplicates(int[] nums) {
        int res = 0;
        int current = nums[0], ct = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == current)
                ++ct;
            else {
                current = nums[i];
                ct = 1;
            }
            if (ct > 2) {
                nums[i] = 100000;
                ++res;
            }
        }
        Arrays.sort(nums);
        return nums.length - res;
    }
}