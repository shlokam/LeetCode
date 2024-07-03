class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        if(n==1)
            return 1;

        int i=0 , j =1;

        for(;j<n;){
            if(nums[i] == nums[j])
                ++j;
            else{
                nums[++i] = nums[j];    
                ++j;
            }
        }

        return i+1;
    }
}