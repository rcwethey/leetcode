class Solution {
    public int removeDuplicates(int[] nums) {
        int newPointer = 0;
        for(int i =0; i <nums.length; i++){
            int uniqueValue = nums[newPointer];
            if(nums[i] != uniqueValue){
                newPointer++;
                nums[newPointer] = nums[i]; 
            }   
        }
        return newPointer+1;
    }
}