class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] finaList = new int[encoded.length+1];
        finaList[0] = first;
        for(int i = 0; i< encoded.length; i++) 
            finaList[i+1] = finaList[i]^encoded[i];
        return finaList;
    }
}