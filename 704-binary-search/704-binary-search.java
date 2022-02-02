class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        int lp = 0, rp = nums.length-1;
    
        while(lp <= rp){
            int midPoint = lp + (rp - lp) /2;
            if(target == nums[midPoint]) return midPoint;
            else if(target < nums[midPoint]) rp = midPoint -1;
            else lp = midPoint +1;
        }
        
        return -1;
        
    
    }

}