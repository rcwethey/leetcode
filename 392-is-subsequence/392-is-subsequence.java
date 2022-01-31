class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        
        int i = 1, prevIndex = t.indexOf(s.charAt(0));
        //System.out.println(s.charAt(0) + " , prevIndex:" + prevIndex);
        if(prevIndex == -1 || s.length() > t.length()) return false;
        if(s.length() == t.length()) return s.equals(t);
        
        return recurvsiveSubString(t.substring(prevIndex+1, t.length()), i, s);
    }
    
    public boolean recurvsiveSubString(String sub, int i, String s){
        while(i < s.length()){
            int index = sub.indexOf(s.charAt(i));
            if(index == -1) return false;
            sub = sub.substring(index+1, sub.length());
            i++;
            return recurvsiveSubString(sub, i, s);
        }
        
        return true;
        
    }
}