class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        int ct = 0;

        for (int i = 0; i < strs.length; ++i) {
            char tempArr[] = new String(strs[i]).toCharArray();
            Arrays.sort(tempArr);

            String temp = new String(tempArr);
            if (map.containsKey(temp)) {
                Integer index = map.get(temp);
                if (index != null && index < ans.size()) {
                    List<String> sublist = ans.get(map.get(temp));
                    if (sublist == null) {
                        sublist = new ArrayList<>();
                        sublist.add(strs[i]);
                        ans.add(map.get(temp), sublist);
                    } else {
                        sublist.add(strs[i]);
                    }
                } 
            } else {
                map.put(temp, ct);
                ++ct;
                List<String> sublist = new ArrayList<>();
                sublist.add(strs[i]);
                ans.add(sublist);
            }
        }

        return ans;

    }
}