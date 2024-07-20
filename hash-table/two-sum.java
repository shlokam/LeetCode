class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> count = new HashMap<>();

        for(int i=0;i<nums.length;++i){
            if(count.containsKey(nums[i]))
                count.put(nums[i],count.get(nums[i])+1);
            else
                count.put(nums[i],1);
        }

   
        int ans1=0,ans2=0,ele,ind1,ind2;
        ind1 = -1; ind2 = -1;

        for(int i=0;i<nums.length;++i){
            ele = target - nums[i];
            if(count.containsKey(ele)){
                if(ele != nums[i]){
                    ans1 = nums[i];
                    ans2 = ele;
                    break;
                }else if(count.get(nums[i])>1){
                    ans1 = nums[i];
                    ans2 = nums[i];
                    break;
                }
            }
        }

        for(int i=0;i<nums.length;++i){
            if(ind1 ==-1 && ans1 == nums[i])
                ind1 = i;
            else if(ind2 ==-1 && ans2 == nums[i])
                ind2 = i;

            if(ind1 != -1 && ind2 != -1)
                break;
        }

        return new int[]{ind1,ind2};
    }
}