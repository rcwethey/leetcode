class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set isAllowed = new HashSet<>();
        int result = words.length;
        for(int i=0; i<allowed.length(); i++) isAllowed.add(allowed.charAt(i));
        
        for(String word: words){
            for(int i= 0; i< word.length(); i++){
                if(!isAllowed.contains(word.charAt(i))){
                    result--;
                    break;
                }
            }
        }
                   
        return result;
    }
}