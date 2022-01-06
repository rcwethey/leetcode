class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        //int length = nums.length;
        for(int i = 0; i < nums.length; i++){
            int length = nums.length-1;
            while(i < length){
                if(nums[i] == nums[length] && i<length) goodPairs++;
                length--;
            }
        }
        return goodPairs;
    }
}