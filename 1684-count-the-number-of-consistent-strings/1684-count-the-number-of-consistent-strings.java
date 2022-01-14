class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        for(String word: words){
            if(!word.matches("[" + allowed + "]+")) count--;
        }
        return count;
    }
}