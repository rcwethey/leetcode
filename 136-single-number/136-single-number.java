class Solution {
    public int singleNumber(int[] nums) {
        short number = (short)nums[0];
        for(int i=1;i<nums.length;i++) number ^= nums[i];
        return number;
    }
}