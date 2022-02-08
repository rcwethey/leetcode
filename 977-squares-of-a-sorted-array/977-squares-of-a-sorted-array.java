class Solution {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> newQueue = new PriorityQueue<>();
        int[] solution = new int[nums.length];
        for(int i = 0; i< nums.length; i++) newQueue.add(nums[i]*nums[i]);
        for(int j = 0; j<nums.length; j++) solution[j] = newQueue.poll();
        
        return solution;
    }
}