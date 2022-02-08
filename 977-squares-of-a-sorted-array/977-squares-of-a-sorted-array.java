class Solution {
    public int[] sortedSquares(int[] nums) {
        //PriorityQueue<Integer> newQueue = new PriorityQueue<>();
        int[] solution = new int[nums.length];
        
        int i = 0, j = nums.length-1;
        int index = solution.length-1;
        
        while(i<=j){
            int val1 = nums[i]*nums[i];
            int val2 = nums[j]*nums[j];
            
            if(val1 < val2){
                solution[index] = val2;
                j--;
            }
            else{
                solution[index] = val1;
                i++;
            }
            index--;
            
        }
        
        //for(int i = 0; i< nums.length; i++) newQueue.add(nums[i]*nums[i]);
        //for(int j = 0; j<nums.length; j++) solution[j] = newQueue.poll();
        
        return solution;
    }
}