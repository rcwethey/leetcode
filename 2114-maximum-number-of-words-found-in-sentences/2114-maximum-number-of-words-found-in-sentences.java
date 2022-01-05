class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0, count = 1;
        for(int i = 0; i < sentences.length; i++){
            String oneSentence = sentences[i];
            for(int k = 0; k < oneSentence.length(); k++){
              if((oneSentence.charAt(k)) == ' ') count++;
              if(count > maxCount) maxCount = count;
            }
            count = 1;
        } 
        return maxCount;
    }
}