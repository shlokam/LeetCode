class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        if(k>n)
        k = k % n;

        n = n-1;

        int i = 0, j = n-k;

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            ++i;
            --j;
        }

        i = n-k+1;
        j = n;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            ++i;
            --j;
        }

        i = 0;
        j = n ;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            ++i;
            --j;
        }

    }
}