class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answerArr = new int[nums.length];
        int numsLarger = 0;
        int numberToCompare = 0;
        while(numberToCompare < nums.length){
            
            for(int i = 0;i<nums.length; i++){
                if(nums[i] < nums[numberToCompare] && i != numberToCompare) 
                    numsLarger++;
            }
            answerArr[numberToCompare] = numsLarger;
            numsLarger = 0;
            numberToCompare++;  
        }
        
        return answerArr;
    }
}