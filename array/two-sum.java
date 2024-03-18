class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=nums.length-1;

      int[] newArray = new int[nums.length];
        
        // Copy values from existing array to the new array
        for (i = 0; i < nums.length; i++) {
            newArray[i] = nums[i];
        }
        Arrays.sort(nums);

        int ans1=-1,ans2=-1,t1=-1,t2=-1;
        i=0;j=nums.length-1;

        while(i<j){
            if(nums[i] + nums[j] == target){
                t1 = nums[i];
                t2 = nums[j];
                break;
                }
            else if(nums[i] + nums[j] > target)
                --j;
            else 
                ++i;
        }

        for(i=0;i<newArray.length;++i){
            if(newArray[i] == t1 && ans1==-1)
                ans1 = i;
            else if(newArray[i] == t2 && ans2==-1)
                ans2=i;
        }

        if(ans1==-1 || ans2==-1)
            return new int[]{};

        return new int[]{ans1,ans2};
    }
}