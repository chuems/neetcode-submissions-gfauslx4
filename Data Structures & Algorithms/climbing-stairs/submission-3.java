public class Solution {
    public int climbStairs(int n) {
        int[] db = new int[n+1];
        return dfs(n, 0, db);
    }

    public int dfs(int n, int i, int[] db) {
      if(i >= n){
        if (i == n){
            return 1;
        }return 0;
      }
      if (db[i] > 0) return db[i];
      db[i] = dfs(n, i + 1, db) + dfs(n, i + 2, db);
        return db[i];
    }
}