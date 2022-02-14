class Solution {
    int[] arr;
    public int getMaximumGenerated(int n) {
        if(n < 2) return n;
        arr = new int[n+1];
        createArray(arr);  
        
        Arrays.sort(arr);
        return arr[n];
    }
    
    void createArray(int[] arr){
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        for(int i = 3; i<arr.length; i++){
            if(i % 2 == 0) arr[i] = arr[i/2];
            else arr[i] = arr[(int)i/2] + arr[(int)i/2+1];
        }
    }
}