class Solution {
    public String reverseWords(String s) {
        String[] sArr = s.split(" ");
        String[] sArrWithoutSpace = new String[sArr];

        int j=0;
        for(int i=0;i<sArr.length;++i){
            System.out.println(i + " " + sArr[i]);
            if(!sArr[i].equals(" ")){
                sArrWithoutSpace[j] = sArr[i];
                ++j;
            }
        }

        

        return s;
    }
}