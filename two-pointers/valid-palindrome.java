class Solution {
    public boolean isPalindrome(String s) {
        String check = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder reversed  = new StringBuilder(check).reverse();
        return check.equals(reversed.toString());
    }
}