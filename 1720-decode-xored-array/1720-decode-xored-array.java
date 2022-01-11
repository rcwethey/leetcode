class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] finaList = new int[encoded.length+1];
        
        for(int i = 0; i< encoded.length; i++){
            finaList[i] = first;
            first = encoded[i]^first;
        }
        
        finaList[encoded.length] = first;
        
        
        return finaList;
    }
}