class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int lessThan = 0, targetVal = 0;
        
        for(int num: nums){
            if(num < target) lessThan++;
            if(num == target) targetVal++;
        }
        
        if(targetVal == 0) return new ArrayList<Integer>();
        
        List<Integer> finalList = new ArrayList<>();
        for(int i = 0; i<targetVal; i++){
            finalList.add(lessThan);
            lessThan++;
        }
            
        return finalList;
        
    }
}