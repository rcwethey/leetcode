class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        
        int k = 0;
        while(k<2){
            for(int i = 0; i <nums.length; i++){
                if(k==0) ans[i] = nums[i];
                else ans[i+ nums.length] = nums[i];
            }
            k++;
        }
        
        return ans;
    }
}