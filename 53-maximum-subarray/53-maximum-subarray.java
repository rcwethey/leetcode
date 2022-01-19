class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, endHere = 0;
        for(int i = 0; i< nums.length; i++){
            endHere = endHere + nums[i];
            if(maxSum < endHere) maxSum = endHere;
            if(endHere < 0) endHere = 0;
        }
        return maxSum;
    }
}