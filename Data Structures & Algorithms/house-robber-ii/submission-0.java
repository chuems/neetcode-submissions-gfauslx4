class Solution {
    private int robLine(int[] nums, int start, int end){
        int n = end - start + 1; 
        if(n == 1) return nums[start];

        int[] dp = new int[n];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);

        for(int i = 2; i < n; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2]+ nums[start + i]);
        }return dp[n-1];
    }

    public int rob(int[] nums) {
        if(nums == null || nums.length < 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
       return Math.max(robLine(nums, 0, nums.length-2), robLine(nums, 1, nums.length-1));
    }
}
