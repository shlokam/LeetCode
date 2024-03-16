class Solution {
    public int maxArea(int[] height) {
        
        int res=0;
        int m;
        int i=0, j = height.length -1;

        while(i<j){
            m = (j-i) * Math.min(height[i],height[j]);
            res = Math.max(res,m);

            if(height[i] > height[j])
                --j;
            else 
                ++i;
        }
        return res;
    }
}