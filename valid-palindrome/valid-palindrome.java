class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(s.length() <= 1) return true;
        int min = 0, max = s.length()-1;
        
        while(min < max && min != max){
            if(s.charAt(min) != s.charAt(max)) return false;
            min++;
            max--;
        }
        return true;
    }
}