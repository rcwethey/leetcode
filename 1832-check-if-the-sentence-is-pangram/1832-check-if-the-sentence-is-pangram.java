class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;
        
        //HashMap<Character, Boolean> alphabet = new HashMap<>();
        char[] alphabet = new char[26];
        int index = 0;
        for(int i = 'a'; i<='z'; i++){
            alphabet[index] = (char)i;
            index++;
        }
        
        for(char c: alphabet) if(sentence.indexOf(c) < 0) return false;
        return true;
    }
}