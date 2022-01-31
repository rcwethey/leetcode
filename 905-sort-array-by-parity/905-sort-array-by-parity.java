class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int lp = 0, rp = nums.length-1;
        while(lp < rp){
            while(lp < nums.length && nums[lp] % 2 == 0) lp++;
            while(rp > 0 && nums[rp] % 2 == 1) rp--;
            if((lp < nums.length && rp > 0) && lp != rp+1) swap(nums, lp, rp);
            lp++;
            rp--;
        }
        
        return nums;
    }
    
    public void swap(int[] nums, int lp, int rp){
        //System.out.println(lp + " : " + rp);
        int temp = nums[lp];
        nums[lp] = nums[rp];
        nums[rp] = temp;
    }
    
    
}