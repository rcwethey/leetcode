class Solution {
    public void rotate(int[] nums, int k) {
        /*
        To do with a O(1) space:
        
        1. Take k mod length
        2. Reverse array
        3. reverse 0 to k-1 in array
        4. reverse k t0 length-1 in array 
        */
        
        
        
        int[] solution = new int[nums.length];
        
        if(nums.length > 1 && k != 0){
            for(int i = 0; i<nums.length; i++){
                int newVal = i+k;
                while(newVal > nums.length-1) newVal -= nums.length;
                solution[newVal] = nums[i];
            }

            for(int j = 0; j<nums.length; j++) nums[j] = solution[j];
        }
    }
}