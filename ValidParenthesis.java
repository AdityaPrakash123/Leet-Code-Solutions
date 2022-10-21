class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(stack.size()%2!=0){
            return false;
        }
        for (char ch:s.toCharArray()){
            if (ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            else if((ch==')'&&!stack.isEmpty()&&stack.peek()=='(')||(ch=='}'&&!stack.isEmpty()&&stack.peek()=='{')||(ch==']'&&!stack.isEmpty()&&stack.peek()=='[')){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.size()==0;
        
    }
}
