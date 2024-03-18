class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        String sortedS = new String(sChar);
        String sortedT = new String(tChar);

        return sortedS.equals(sortedT);
    }
}