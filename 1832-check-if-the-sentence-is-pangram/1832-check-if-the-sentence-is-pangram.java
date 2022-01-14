class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character, Boolean> alphabet = new HashMap<>();
        for(char i = 'a'; i<='z'; i++) alphabet.put(i, false);
        
        for(int i = 0; i< sentence.length(); i++){
            if(alphabet.containsKey(sentence.charAt(i)) && alphabet.get(sentence.charAt(i)) == false) 
                alphabet.put(sentence.charAt(i), true);
        }
        
        if(alphabet.containsValue(false)) return false;
        return true;
    }
}