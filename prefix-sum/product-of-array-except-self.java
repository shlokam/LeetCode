class Solution {
    public int[] productExceptSelf(int[] nums) {

        int m = 1;
        int mWithoutZero = 1;
        int res[] = new int[nums.length];

        int ct=0;

        for(int i=0;i<nums.length;++i){
                m = m * nums[i];
                if(nums[i]!=0)
                    mWithoutZero = mWithoutZero * nums[i];
            if(nums[i] == 0)
                ++ct;
        }

        for(int i=0;i<nums.length;++i){

            if(nums[i] == 0 && ct==1){
                res[i] = mWithoutZero;
            }
            else if(ct>0)
                res[i] = 0;
            if(nums[i]!=0)
            res[i] = m/nums[i];
        }

        return res;
        
    }
}