class Solution {
    public String reverseWords(String s) {
        String[] sArr = s.split(" ");

        StringBuilder resultBuilder = new StringBuilder();
        for(int i=sArr.length-1;i>=0;--i){
            if(!sArr[i].equals("")){
                resultBuilder.append(sArr[i]).append(" ");
            }
        }
        return resultBuilder.toString().trim();
    }
}