class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for(int i=1; i<n; i++){
            if(i<2) dp[i] = Math.max(nums[i],dp[i-1]);
            else dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        //for(int i = 0; i<dp.length; i++) System.out.print(dp[i]+",");
        return dp[n-1];
    }
}