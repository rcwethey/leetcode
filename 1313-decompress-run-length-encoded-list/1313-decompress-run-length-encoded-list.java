class Solution {
    public int[] decompressRLElist(int[] nums) {
        int finalListSize = 0;
        for(int l = 0; l < nums.length; l+=2) finalListSize += nums[l];
        
        int[] finalList = new int[finalListSize];
        
        int startIndex = 0;
        for(int i = 0; i<nums.length; i+=2){
            Arrays.fill(finalList, startIndex, startIndex + nums[i], nums[i+1]);
            startIndex += nums[i];
        }
        
        return finalList;
    }
}