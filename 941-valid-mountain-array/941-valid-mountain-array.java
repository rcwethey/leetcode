class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        
        int i = arr.length-1, j = 0;
        while(i > 1 && arr[i] < arr[i-1]) i--;
        while(j < arr.length-2 && arr[j] < arr[j+1]) j++;
        
        if(i == j) return true;
        return false;
    }
}