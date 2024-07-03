class Solution {
    public boolean check(int[] nums) {

        int d;
        int ct = 0;
        int n = nums.length;
        for (int i = 1; i < n; ++i) {

            d = nums[i] - nums[i - 1];

            if (d < 0) {
                ++ct;
            }
        }

        if(ct == 0)
            return true;
        if (ct > 1)
            return false;
        if (nums[n - 1] <= nums[0])
            return true;

        return false;
    }
}