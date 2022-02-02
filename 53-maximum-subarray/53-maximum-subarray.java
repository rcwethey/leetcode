class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, end = 0;
        for(int i=0; i<nums.length; i++){
            end = end + nums[i];
            maxSum = Math.max(end, maxSum);
            if(end < 0) end = 0;
        }
        
        return maxSum;
        
    }
}

/**

[5,4,-1,7,8]
          |
          
maxSum = 15
end = 23

**/












































/*
    int maxSum = Integer.MIN_VALUE, endHere = 0;
    for(int i = 0; i< nums.length; i++){
        endHere = endHere + nums[i];
        if(maxSum < endHere) maxSum = endHere;
        if(endHere < 0) endHere = 0;
    }
    return maxSum;

*/