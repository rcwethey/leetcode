class Solution {
    public int[] buildArray(int[] nums) {
        //int[] ans = new int[nums.length];
        //for(int i = 0; i< nums.length; i++) ans[i] = nums[nums[i]];
        //return ans;
        
        //int n = nums.length;
        for(int i = 0; i<nums.length; i++) nums[i] = nums[i]+(nums.length*(nums[nums[i]]%nums.length));
        
        for(int i = 0; i < nums.length; i++) nums[i] = nums[i] / nums.length;
        
        return nums;
    }
}