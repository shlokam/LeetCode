class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        System.out.println(map); // 3 -> 1

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // 3
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        return null;
    }
}