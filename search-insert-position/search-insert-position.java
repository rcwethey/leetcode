class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        return logSearch(nums, start, end, target);
    }
    
    public int logSearch(int[] nums, int start, int end, int target){
        int midIndex = (int)Math.floor((start+end)/2);
        
        if(nums[midIndex] == target) 
            return midIndex;
        
        if(start >= end) return (target < nums[start]) ? start : start+1;
        
        if(target < nums[midIndex]) 
            return logSearch(nums, start, midIndex-1, target);
        else 
            return logSearch(nums, midIndex+1, end, target);
        
    }    
    
}