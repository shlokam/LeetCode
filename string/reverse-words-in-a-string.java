class Solution {
    public String reverseWords(String s) {
        String[] sArr = s.split(" ");
        String res="";

        int j=0;
        for(int i=sArr.length-1;i>=0;--i){
            if(!sArr[i].equals("")){
                if(res.equals(""))
                    res = sArr[i];
                else
                    res = res + " " + sArr[i];
            }
        }
        return res;
    }
}