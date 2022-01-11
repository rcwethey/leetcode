class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int itemsMatched = 0, index = (ruleKey.equals("type")) ? 0 : (ruleKey.equals("color")) ? 1:2;
        
        for(int i=0; i<items.size(); i++){
            if((items.get(i).get(index)).equals(ruleValue)) itemsMatched++;
        }
        
        return itemsMatched;
    }
}