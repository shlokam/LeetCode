class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < nums.length; ++i) {
            if (i == 0) {
                res.add(String.valueOf(nums[i]));
            } else {
                if (nums[i] - nums[i - 1] == 1) {
                    if (res.get(res.size() - 1).contains("->")) {
                        String temp = res.get(res.size() - 1);
                        String[] split = temp.split("->");
                        split[1] = String.valueOf(nums[i]);

                        String updatedString = String.join("->", split);
                        res.set((res.size() - 1), updatedString);
                    } else {
                        String s = new String(res.get(res.size() - 1) + "->" + nums[i]);
                        res.set((res.size() - 1), s);
                    }
                } else {
                    res.add(String.valueOf(nums[i]));
                }

            }
        }

        return res;
    }
}