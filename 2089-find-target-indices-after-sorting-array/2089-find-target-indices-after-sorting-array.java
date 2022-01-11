class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> finalList = new ArrayList<>();
        int lessThan = 0, targetVal = 0;
        
        for(int num: nums){
            if(num < target) lessThan++;
            if(num == target) targetVal++;
        }
        
        for(int i = lessThan; i<(lessThan+targetVal); i++){
            finalList.add(i);
        }
            
        return finalList;
        
    }
}