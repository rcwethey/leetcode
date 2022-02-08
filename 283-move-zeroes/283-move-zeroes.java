class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length > 1){
            
            int lp = 0, rp = 1;
            while(rp < nums.length){
                while(rp < nums.length && nums[rp] == 0) rp++;
                while(lp < rp && nums[lp] != 0) lp++;
                if(rp < nums.length) swap(lp, rp, nums);
                rp++;
                lp++;
            } 
            
        }
    }
    
    public void swap(int lp, int rp, int[] nums){
        int temp = nums[lp];
        nums[lp] = nums[rp];
        nums[rp] = temp;
    }
}