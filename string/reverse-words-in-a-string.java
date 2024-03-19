class Solution {
    public String reverseWords(String s) {
        String[] sArr = s.split(" ");
        String[] sArrWithoutSpace = new String[sArr.length];
        String res="";

        int j=0;
        for(int i=0;i<sArr.length;++i){
            if(!sArr[i].equals("")){
                sArrWithoutSpace[j] = sArr[i];
                ++j;
            }
        }
        int num = j;
        for(int i=num-1;i>=0;--i){
             if(res.equals(""))
                res =  sArrWithoutSpace[i];
            else
                res = res + " " + sArrWithoutSpace[i];
        }

        return res;
    }
}