class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> finalList = new ArrayList<>();
        
        int i = 0;
        while(i<nums.length){
            for(int k = 0; k < nums[i]; k++) finalList.add(nums[i+1]);
            i = i+2;
        }
        
        int[] arr = new int[finalList.size()];
        for(int l = 0; l < finalList.size(); l++) arr[l] = finalList.get(l);
        return arr;
    }
}