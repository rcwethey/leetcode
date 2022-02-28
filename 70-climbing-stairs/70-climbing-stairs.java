class Solution {
    public int[] arr;
    public int climbStairs(int n) {
        if(n <= 3) return n;
        else{
            arr = new int[n-1];
            arr[0] = 2;
            arr[1] = 3;
            createList(n);
        }
        
        return arr[arr.length-1];
        
        //return climbStairs(n-1) + climbStairs(n-2);
        //its too slow  
    }
    
    public void createList(int n){
        for(int i=2; i<=n-2; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        
        //arr[2] = arr[1] + arr[0];
        // arr[2] = 2 + 3;
        
        //arr[3] = arr[2] + arr[1];
        //arr[3] = 5 + 3;
    }
}