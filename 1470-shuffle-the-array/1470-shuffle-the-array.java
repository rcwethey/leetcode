class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[nums.length];
        
        int k = 0;    
        while(k < nums.length/2){
            answer[k*2] = nums[k];
            answer[(k*2)+1] = nums[n+k];
            k++;
        }
        
        return answer;
    }
}