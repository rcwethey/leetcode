class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder word1Str = new StringBuilder();
        StringBuilder word2Str = new StringBuilder();
        
        for(String characterStr : word1) word1Str.append(characterStr);
        for(String characterStr: word2) word2Str.append(characterStr);
        return word1Str.toString().equals(word2Str.toString());
        
    }
}