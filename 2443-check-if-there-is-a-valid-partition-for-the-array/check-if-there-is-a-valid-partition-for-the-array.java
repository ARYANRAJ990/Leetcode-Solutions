public class Solution {
    int[] dp = new int[100005];
    
    public int solve(int j, int[] nums) {
        if (j == nums.length) {
            return 1;
        }
        if (dp[j] != -1) {
            return dp[j];
        }
        int c = 0;
        if (j + 1 < nums.length) {
            if (nums[j] == nums[j + 1]) {
                c |= solve(j + 2, nums);
            }
        }
        if (j + 2 < nums.length) {
            if (nums[j] == nums[j + 1] && nums[j] == nums[j + 2]) {
                c |= solve(j + 3, nums);
            }
            if (nums[j] + 1 == nums[j + 1] && nums[j + 1] + 1 == nums[j + 2]) {
                c |= solve(j + 3, nums);
            }
        }
        return dp[j] = c;
    }
    
    public boolean validPartition(int[] nums) {
        Arrays.fill(dp, -1);
        return solve(0, nums) == 1;
    }
}