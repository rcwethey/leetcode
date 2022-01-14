class Solution {
    public String firstPalindrome(String[] words) {
        String firstPalindromic = "";
        int palindromicIndex = words.length;
        for(int j = 0; j< words.length; j++){
            int flag=0;
            for(int i=0; i<words[j].length()-1; i++){
                if(words[j].charAt(i)!=words[j].charAt(words[j].length()-i-1)){
                    flag = 1;
                    break;
                }
            }
            if(flag==0 && j < palindromicIndex){ 
                palindromicIndex = j;
                break;
            }
        }
        if(palindromicIndex == words.length) return "";
        return words[palindromicIndex];
    }
}