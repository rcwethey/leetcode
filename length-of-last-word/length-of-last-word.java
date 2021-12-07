class Solution {
    public int lengthOfLastWord(String s) {
        char[] stringToChar = s.toCharArray();
        
        int i = stringToChar.length-1;
        while(Character.isWhitespace(stringToChar[i])) i--;
        
        String newString = s.substring(0, i+1);
        int lastSpace = newString.lastIndexOf(" ");
        
        return newString.length()-1 - lastSpace;
        
        
        //return i; 
    }
}