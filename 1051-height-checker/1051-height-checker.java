class Solution {
    public int heightChecker(int[] heights) {
        int[] ogHeights = new int[heights.length];
        for(int j=0; j<heights.length; j++) ogHeights[j] = heights[j];
        
        Arrays.sort(heights);
        
        int misSorted = 0;
        for(int i=0; i<heights.length; i++) if(heights[i] != ogHeights[i]) misSorted++; 
        return misSorted;
    }
}