class Solution {
    public int fib(int n) {
        if(n > 2) return fib(n-1) + fib(n-2);
        if(n == 1 || n == 2) return 1;
        else return 0;
    }
}