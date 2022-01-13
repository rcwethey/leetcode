class Solution {
    public String sortSentence(String s) {
        String[] strArr = s.split(" ");
        String[] finalArr = new String[strArr.length];
        for(int i = 0; i < strArr.length; i++){
            String current = strArr[i];
            int index = current.charAt(current.length()-1)-'0';
            String word = current.substring(0, current.length()-1);
            finalArr[index-1] = word;
        }
        
        StringBuilder finalString = new StringBuilder();
        for(String word: finalArr) 
            finalString.append(word).append(" ");
        
        return finalString.toString().trim();
        
    }
}