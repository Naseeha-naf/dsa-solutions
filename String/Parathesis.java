class Solution {
    public boolean isValid(String s) {
        Stack<Character> a=new Stack<>();
        for(char i: s.toCharArray()){
            if(i=='('|| i=='{' || i=='['){
                a.push(i);
            }
            else{ // if for close symbols check
                if(a.isEmpty()){
                    return false;
                }
                char b=a.pop();
                if((i==')' && b!='(') || ( i=='}' && b!='{') || (i==']' &&  b!='[')){ //pairs
                    return false;
                }
            }
        }
        return a.isEmpty();
        
    }
}
