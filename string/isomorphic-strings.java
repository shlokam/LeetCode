class Solution {
    public boolean isIsomorphic(String s, String t) {
       Map<Character,Character> map = new HashMap<>();

       for(int i=0;i<s.length();++i){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!= t.charAt(i))
                    return false;
            }else{
                Character temp = getKeyFromValue(map,t.charAt(i));
                if(temp!=null)
                    return false;
                map.put(s.charAt(i),t.charAt(i));
            }
       }
       return true;
    }

    public Character getKeyFromValue(Map<Character,Character> map, Character c){
        for(Map.Entry<Character,Character> m : map.entrySet()){
            if(m.getValue() == c)
                return m.getKey();
        }

        return null;
    }
}