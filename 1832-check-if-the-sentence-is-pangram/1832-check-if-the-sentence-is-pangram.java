class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;
        HashMap<Character, Boolean> alphabet = new HashMap<>();
        for(int i = 'a'; i<='z'; i++) alphabet.put((char)i, false);
        
        for(int i = 0; i< sentence.length(); i++){
            char c = sentence.charAt(i);
            if(alphabet.containsKey(c) && alphabet.get(c) == false) alphabet.put(c, true);
        }
        
        if(alphabet.containsValue(false)) return false;
        return true;
    }
}