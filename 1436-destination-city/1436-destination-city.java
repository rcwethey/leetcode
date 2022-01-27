class Solution {
    public String destCity(List<List<String>> paths){
        List<String> firstStops = new ArrayList<>();
        String destination = "";
        
        for(int i=0; i<paths.size(); i++) firstStops.add(paths.get(i).get(0));
        
        for(int j=0; j<paths.size(); j++){
            if(firstStops.indexOf(paths.get(j).get(1)) == -1) destination = paths.get(j).get(1);
        }
        
        return destination;
    }
}