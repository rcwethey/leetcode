class Solution {
    int[] arr;
    public int fib(int n) {
        /*
        if(n > 2) return fib(n-1) + fib(n-2);
        if(n == 1 || n == 2) return 1;
        else return 0;
        */
        
        //create an array and compute all the numbers up to n+1 length using fib sequence
        //return array pos n
        if(n == 0) return 0;
        if(n == 1 || n== 2) return 1;
        arr = new int[n+1];
        createArray(arr);
        return arr[n];
    }
    
    void createArray(int[] arr){
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        
        for(int i = 3; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
    }
}