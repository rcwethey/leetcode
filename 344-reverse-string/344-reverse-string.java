class Solution {
    public void reverseString(char[] s) {
        int lp = 0, rp = s.length-1;
        
        while(lp<rp){
            swap(lp, rp, s);
            lp++;
            rp--;
        }
    }
    
    public void swap(int lp, int rp, char[] s){
        char temp = s[lp];
        s[lp] = s[rp];
        s[rp] = temp;
    }
}