class Solution {
    public int[] plusOne(int[] digits) {

        int len = digits.length;
        if (digits[len - 1] != 9) {
            digits[len - 1] = digits[len - 1] + 1;
            return digits;
        } else {
            int i = len - 1;
            while (i >= 0 && digits[i] == 9) {
                digits[i] = 0;
                --i;
            }
            if (i!=-1 && digits[i] != 0) {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }
        if (digits[0] == 0) {
            int[] modified = new int[len + 1];
            modified[0] = 1;
            return modified;
        }
        return digits;
    }
}