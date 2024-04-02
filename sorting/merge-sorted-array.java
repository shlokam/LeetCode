class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] res = new int[m+n];

        int i=0,j=0,k=0;

        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                res[k] = nums1[i];
                ++k;
                ++i;
            }else{
                res[k] = nums2[j];
                ++k;
                ++j;
            }
        }

        if(i<m){
            for(;i<m;++i){
                res[k] = nums1[i];
                ++k;
            }
        }

        if(j<n){
             for(;j<n;++j){
                res[k] = nums2[j];
                ++k;
            }
        }

        for(int z =0; z<res.length;++z)
           nums1[z] = res[z];
        
    }
}