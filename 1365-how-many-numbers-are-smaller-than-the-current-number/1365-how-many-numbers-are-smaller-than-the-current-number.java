class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap <Integer, Integer> store = new HashMap<>();
        int[] temp = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) temp[i] = nums[i];
        Arrays.sort(temp);
        
        for(int i = nums.length-1; i>=0; i--) store.put(temp[i], i);
        for(int i = 0; i < nums.length; i++) nums[i] = store.get(nums[i]);
        return nums;
    }
}