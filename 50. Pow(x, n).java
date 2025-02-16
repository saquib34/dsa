class Solution {
    public double myPow(double x, int n) {
        long bf=n;
        double ans=1;
        // if(n==0){
        //     return 1;
        // }
        // if(x==0){
        //     return 0;
        // }
        // if(x==1){
        //     return 1;
        // }
        // if(x==-1){
        //     if(n%2==0){
        //         return 1;
        //     }
        //     else{
        //         return -1;
        //     }
        // }
        if(n<0){
            x=1/x;
            bf=-bf;
        }
        while(bf>0){
            if(bf%2==1){
                ans*=x;
            }
            x*=x;
            bf=bf/2;
        }
        return ans;
    }
}