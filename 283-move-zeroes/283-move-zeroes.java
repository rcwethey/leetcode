class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length > 1){
            int lp = 0, rp = 1;
            /*
            
            If nums[lp] == 0 swap nums[rp] with nums[lp]
            else lp++ until 0 and rp++ until non-zero 0r nums.length and 0
            
            
            */
            while(rp < nums.length){
                while(rp < nums.length && nums[rp] == 0) rp++;
                while(lp < rp && nums[lp] != 0) lp++;
                if(rp < nums.length) swap(lp, rp, nums);
                rp++;
                lp++;
                //System.out.println(lp + " : " + rp);
            } 
        }
    }
    
    public void swap(int lp, int rp, int[] nums){
        //System.out.println("nums[lp]: " + nums[lp] + ", nums[rp] :" + nums[rp]);
        int temp = nums[lp];
        nums[lp] = nums[rp];
        nums[rp] = temp;
        //System.out.println("nums[lp]: " + nums[lp] + ", nums[rp] :" + nums[rp]);
    }
}