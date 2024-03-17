class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> check = new HashMap<>();

        String[] parts = s.split(" ");

        if(pattern.length() != parts.length)
            return false;
        for(int i=0;i<pattern.length();++i){

            if(check.containsKey(pattern.charAt(i))){
                if(!check.get(pattern.charAt(i)).equals(parts[i]))
                    return false;
            }else if(check.containsValue(parts[i])){
                if(getKeyFromValue(check,parts[i]) != pattern.charAt(i))
                    return false;
            }
            else{
                check.put(pattern.charAt(i) ,parts[i]);
            }
        }

        return true;
    }

    public static Character getKeyFromValue(Map<Character, String> map, String value) {
        for (Map.Entry<Character, String> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null; // Return null if value not found
    }
}