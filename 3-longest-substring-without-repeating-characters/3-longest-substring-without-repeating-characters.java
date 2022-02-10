class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        int lp = 0, rp = 1, size = s.length(), maxLength = 0;
        String sub = "";
        
        while(rp < size){
            sub = s.substring(lp, rp);
            if(sub.indexOf(s.charAt(rp)) >= 0){
                lp += sub.indexOf(s.charAt(rp))+1;
            }
            
            maxLength = Math.max(rp-lp+1, maxLength);
            rp++;
        }
        
        return maxLength;
    }
}