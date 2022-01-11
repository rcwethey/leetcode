class Solution {
    public int[] decode(int[] encoded, int first) {
        List<Integer> tempList = new ArrayList<>();
        
        
        for(int i = 0; i< encoded.length; i++){
            tempList.add(first);
            first = encoded[i]^first;
        }
        
        tempList.add(first);
        
        int[] finalList = new int[tempList.size()];
        for(int k = 0; k < finalList.length; k++) finalList[k] = tempList.get(k);
        
        return finalList;
    }
}