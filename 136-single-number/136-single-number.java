class Solution {
    public int singleNumber(int[] nums) {
        int number = 0;
        for(int numbers: nums) number ^= numbers;
        return number;
    }
}