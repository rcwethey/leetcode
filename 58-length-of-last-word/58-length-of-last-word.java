class Solution {
    public int lengthOfLastWord(String s) {
        String newS = s.trim();
        int i = newS.length()-1;
        while(i>0 && newS.charAt(i) != ' ') i--;
        return i == 0 ? newS.length() : newS.length()-1 - i;
        /*
        char[] stringToChar = s.toCharArray();
        
        int i = stringToChar.length-1;
        while(Character.isWhitespace(stringToChar[i])) i--;
        
        String newString = s.substring(0, i+1);
        int lastSpace = newString.lastIndexOf(" ");
        
        return newString.length()-1 - lastSpace;
        */
    }
}