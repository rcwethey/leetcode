class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character, Boolean> alphabet = new HashMap<>();
        for(char i = 'a'; i<='z'; i++) alphabet.put(i, false);
        
        for(int i = 0; i< sentence.length(); i++){
            char c = sentence.charAt(i);
            if(alphabet.containsKey(c) && alphabet.get(c) == false) alphabet.put(c, true);
        }
        
        if(alphabet.containsValue(false)) return false;
        return true;
    }
}