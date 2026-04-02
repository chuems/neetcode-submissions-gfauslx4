class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        # 1. Create a DP table filled with a "Max" value
        dp = [amount + 1] * (amount + 1)
        dp[0] = 0  # Base case: 0 coins to make 0 amount
        
        # 2. Iterate through every sub-amount from 1 to total amount
        for i in range(1, amount + 1):
            for coin in coins:
                if i - coin >= 0:
                    # 3. Update dp[i] with the minimum coins found
                    dp[i] = min(dp[i], dp[i - coin] + 1)
        
        # If dp[amount] is still the "Max" value, no solution exists
        return dp[amount] if dp[amount] <= amount else -1