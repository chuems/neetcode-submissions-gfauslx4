class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean dp[] = new boolean[s.length() + 1];
        dp[0] = true;

        for(int i = 0; i < s.length() ; i++){
            if(!dp[i]) continue;
            for(String word : wordDict){
                int len = word.length();

                if(i + len <= s.length() && s.substring(i, i+ len).equals(word)){
                        dp[i + len] = true;
                }
            }
        }return dp[s.length()];
    }
}
