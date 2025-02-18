class Solution {

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
         int prev = nums[0];
        int prev2 = 0;
        for (int i = 1; i < n; i++) {
            int take = nums[i] + prev2;
            int nonTake = prev;
            int curr = Math.max(take, nonTake);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}