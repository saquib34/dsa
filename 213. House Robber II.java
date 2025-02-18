class Solution {
    int maxNonAdjacentSum(int[] arr, int start, int end) {
        int prev = 0;
        int prev2 = 0;
        for (int i = start; i < end; i++) {
            int take = arr[i] + prev2;
            int nonTake = prev;
            int curr = Math.max(take, nonTake);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        return Math.max(maxNonAdjacentSum(nums, 0, n - 1), maxNonAdjacentSum(nums, 1, n));
    }
}