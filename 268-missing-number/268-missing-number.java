class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        if(nums[0] != 0) return 0;
        
        int number = nums.length;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1] - nums[i] != 1) number = nums[i]+1;
        }
        
        return number;
        
        
    }
}