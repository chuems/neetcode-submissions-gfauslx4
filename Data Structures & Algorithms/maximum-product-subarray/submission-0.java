class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            result = Math.max(result, curr);

            for (int j = i + 1; j < nums.length; j++) {
                curr = curr * nums[j];
                result = Math.max(result, curr);
            }
        }
        return result;
    }
}
