class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        // 1. FILL the array with a large value (amount + 1 is safe)
        java.util.Arrays.fill(dp, amount + 1);
        
        dp[0] = 0;
       
        for(int i = 1; i <= amount; i++){
            for(int j = 0; j < coins.length; j++){
                
                if(i - coins[j] >= 0){
                dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]); //formula
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
