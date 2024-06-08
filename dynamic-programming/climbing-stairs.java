class Solution {
    public int climbStairs(int n) {

        int dp[] = new int[n];

        for(int i=0;i<n;++i)
            dp[i] = -1;
        return f(n,n,dp);
    }

    static int f(int n, int sum, int dp[]){
        if(sum ==0)
            return 1;
        
        if (dp[sum-1] !=-1)
            return dp[sum-1];

        int ct =  f(n, sum-1,dp);
       
        if(sum>1)
           ct+= f(n, sum-2,dp);

        dp[sum-1] = ct;

        return  dp[sum-1];
    }
}