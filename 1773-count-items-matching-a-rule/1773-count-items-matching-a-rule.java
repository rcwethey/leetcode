class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int itemsMatched = 0, index;
        
        if(ruleKey.equals("type")) index = 0;
        else if(ruleKey.equals("color")) index = 1;
        else index=2;
        
        for(int i=0; i<items.size(); i++){
            List<String> item = items.get(i);
            if((item.get(index)).equals(ruleValue)) itemsMatched++;
        }
        
        return itemsMatched;
    }
}