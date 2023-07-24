/* 20. Valid Parentheses */

class Solution {
    public boolean isValid(String s) {
        if(s == null)   return false;
        Stack<Character> stk = new Stack<Character>();
        //string put in stack
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') 
                stk.push(s.charAt(i));
            else if(!stk.isEmpty() && ((stk.peek() == '{' && s.charAt(i) == '}') || (stk.peek() == '(' && s.charAt(i) == ')') ||  (stk.peek() == '[' && s.charAt(i) == ']')))                    
                stk.pop();
            else return false;
        }
        return stk.isEmpty();

    }
}
