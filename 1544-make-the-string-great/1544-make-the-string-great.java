class Solution {
    public String makeGood(String s) {
        if(s.length() < 2) return s;
        char[] oldString = s.toCharArray();
        StringBuilder newString = new StringBuilder();
        newString.append(oldString[0]);
        
        for(int i=1; i<oldString.length; i++){
            if(newString.length() == 0){
                newString.append(oldString[i]);
                continue;
            }
            
            int difference = Math.abs((oldString[i]-0) - (newString.charAt(newString.length()-1)-0));
            if(difference == 32) newString.deleteCharAt(newString.length()-1);
            else newString.append(oldString[i]);
        }
               
        return newString.toString();
    }
}