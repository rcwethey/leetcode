class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int lengthOfSearchWord = searchWord.length();
        int minIndex = -1;
        
        for(int i = 0; i< words.length; i++){
            if(lengthOfSearchWord > words[i].length()) continue;
            else if(words[i].substring(0, lengthOfSearchWord).equals(searchWord)){ 
                    minIndex = i+1;
                    break;
            }
            
        }
        return minIndex;
    }
}