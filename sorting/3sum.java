class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> res = new HashSet<>();

        List<List<Integer>> result = new ArrayList<>();
        int i,j;

        Arrays.sort(nums);
        for(int k=0;k<nums.length-2;++k){
            i = k+1; j = nums.length-1;

            while(i<j){
                if(nums[i] + nums[j] == -1*nums[k]){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    res.add(temp);
                    ++i;
                    --j;
                }else if(nums[i] + nums[j] > -1*nums[k])
                    --j;
                else
                    ++i;
            }
        }

        for(List<Integer> list : res){
            result.add(list);
        } 

        return result;      
    }
}