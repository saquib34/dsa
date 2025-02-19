class Solution {
    int minCost(int[] height) {
        // code here
        int prev=0;
        int prev2=0;
        for(int i=1;i<height.length;i++){
            int fs=prev+Math.abs(height[i]-height[i-1]);
            int ss=Integer.MAX_VALUE;
            if(i>1){
                ss=prev2+Math.abs(height[i]-height[i-2]);
            }
            int curr=Math.min(fs,ss);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}