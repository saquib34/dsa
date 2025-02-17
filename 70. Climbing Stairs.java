class Solution {
    public int climbStairs(int n) {
         if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        // int dp[]=new int[n+1];
       
        // dp[1]=1;
        // dp[2]=2;
        // for (int i=3;i<=n;i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n];
        int prev1=2;
        int prev2=1;
        int sum=0;
        for(int i=3;i<=n;i++){
            sum=prev1+prev2;
            prev2=prev1;
            prev1=sum;
        }
        return sum;
    }
}