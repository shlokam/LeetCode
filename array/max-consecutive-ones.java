class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0, ct=0;

        for(int i=0;i<nums.length;++i){
            if(nums[i] == 1)
                ++ct;
            else{
                ans = Math.max(ct,ans);
                ct=0;
            }
        }

        ans = Math.max(ct,ans);

        return ans;
    }
}