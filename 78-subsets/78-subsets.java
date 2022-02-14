class Solution {
    List<List<Integer>> sol = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        helper(nums, 0, new ArrayList<Integer>());
        return sol;
    }
    
    public void helper(int[] nums, int start, List<Integer> sublist){
        
        if(start == nums.length){
            sol.add(new ArrayList<>(sublist));
            return;
        }
        
        int val = nums[start];
        sublist.add(val);
        helper(nums, start+1, sublist);
        sublist.remove((Integer) val);
        helper(nums, start+1, sublist);
    }
}