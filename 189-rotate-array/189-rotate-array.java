class Solution {
    public void rotate(int[] nums, int k) {
        /*
        To do with a O(1) space:
        
        1. Take k mod length
        2. Reverse array
        3. reverse 0 to k-1 in array
        4. reverse k t0 length-1 in array 
        */
        
        // O(n) space and 
        int[] solution = new int[nums.length];
        
        if(nums.length > 1 && k != 0){
            //k = k%nums.length;
            for(int i = 0; i<nums.length; i++){
                int newVal = i+k;
                while(newVal > nums.length-1) newVal -= nums.length;
                //if(i+k > nums.length) solution[i+k-nums.length] = nums[i];
                //else 
                solution[newVal] = nums[i];
            }

            for(int j = 0; j<nums.length; j++) nums[j] = solution[j];
        }
    }
}