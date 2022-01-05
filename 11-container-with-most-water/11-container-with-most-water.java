class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int volume = 0;
        for(int i = 0; i < height.length; i++){
            if(height[i] < height[height.length-1]) volume = height[i] * (height.length-1-i);
            else volume = height[height.length-1] * (height.length-1-i);
            if(volume > max) max = volume;
            volume = 0;
        }
        
        for(int k = height.length-1; k >= 0; k--){
            if(height[0] < height[k]) volume = height[0] * k;
            else volume = height[k] * k;
            if(volume > max) max = volume;
            volume = 0;
        }
        
        int left = 0;
        int right = height.length-1;
        while(left != right){
            if(height[left] < height[right]){
                volume = height[left] * (right-left);
                left++;
            }else{
                volume = height[right] * (right-left);
                right--;
            }
            if(volume > max) max = volume;
            volume = 0;
        }
        
        return max;
    }
}