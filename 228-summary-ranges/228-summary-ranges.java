class Solution {
    List<String> finalSummaryRanges;
    int leftPointer = 0;
    int rightPointer = 0;
    
    public List<String> summaryRanges(int[] nums) {
        finalSummaryRanges = new ArrayList<>();
        if(nums.length == 0) return finalSummaryRanges;
        
        for(int i = 0; i<nums.length; i++){
            if(rightPointer+1 < nums.length && nums[rightPointer+1] == nums[rightPointer]+1) rightPointer++;
            else addtoArrayList(nums);
        }
        
        return finalSummaryRanges;
    }
    
    public void addtoArrayList(int[] nums){
        if(leftPointer < rightPointer)
            finalSummaryRanges.add(Integer.toString(nums[leftPointer])+"->"+Integer.toString(nums[rightPointer]));
        else finalSummaryRanges.add(Integer.toString(nums[rightPointer]));
        
        rightPointer++;
        leftPointer = rightPointer;
    }
}