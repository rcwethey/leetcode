class Solution {
    public List<Character> open = new ArrayList<>(){{
            add('(');
            add('{');
            add('[');
        }};
    
    public List<Character> closed = new ArrayList<>(){{
            add(')');
            add('}');
            add(']');
        }};
    
    public Stack<Character> stack = new Stack<>();
    
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        if(closed.contains(ch[0])) return false;
        boolean statement = test(ch);
        return statement;
    }
    
    public boolean test(char[] ch){
        int index = -1;
        for(char c: ch){
            if(open.contains(c)) stack.push(c);
            else if(closed.contains(c) && !stack.empty()){
                    index = closed.indexOf(c);
                
                    if (open.indexOf(stack.peek()) == index) stack.pop();
                    else return false;
                    
            }else return false;
        }
        if(!stack.empty()) return false;
        return true;
    }
}