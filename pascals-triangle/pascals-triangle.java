class Solution {
    public List<List<Integer>> generate(int numRows) {
        int i = 1;
        List<List<Integer>> newList = new ArrayList<List<Integer>>(numRows);
        
        while(i <= numRows){
            List<Integer> numList = new ArrayList<>();
            
            if(i == 1) numList.add(1);
            else if(i == 2){
                numList.add(1);
                numList.add(1);
            }else{
                
                int k = 0;
                List<Integer> temp = newList.get(i-2);
                
                while(k < i){
                    if(k == 0 || k == i-1) numList.add(1); 
                    else numList.add(temp.get(k-1) + temp.get(k));
                    k++;
                }
            }
            newList.add(numList);
            i++;
        }
        return newList;
    }
}