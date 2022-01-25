class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3) return new ArrayList<>();
        
        Arrays.sort(nums);
        List<List<Integer>> solutions = new ArrayList<>();
        
        if(nums.length == 3 && ((nums[0] + nums[1] + nums[2]) == 0)){
            solutions.add(Arrays.asList(nums[0], nums[1], nums[2]));
        }
        
        for(int i = 0; i< nums.length-3; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int upper = nums.length-1, lower = i+1, sum = 0-nums[i];
                while(upper > lower){
                    int total = nums[lower]+nums[upper];
                    if(total > sum) upper--;
                    if(total < sum) lower++;
                    if(total == sum){
                        solutions.add(Arrays.asList(nums[i], nums[lower], nums[upper]));
                        
                        while(lower < upper && nums[lower] == nums[lower+1]) lower++;
                        while(lower < upper && nums[upper] == nums[upper-1]) upper--;
                        
                        lower++;
                        upper--;
                    }
                }
            }
        }
        //[-4,-1,-1,0,1,2]
        
        return solutions;
    }
}