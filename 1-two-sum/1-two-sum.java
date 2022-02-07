class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        for(int i = 1; i<nums.length; i++){
            int val = target - nums[i];
            if(map.containsKey(val)){
                ans[1] = i;
                ans[0] = map.get(val);
                return ans;
            }else map.put(nums[i], i);
        }
        return ans;   
    }
}