class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 1;
        
        if(n == 1){
            return 1;
        }
        return fib(n,a,b,2);
        
    }
    public int fib(int n,int a, int b, int i){
        int c = a+b;
        a = b;
        b = c;
        
        if(i>=n){
            return b;
        }
        return fib(n,a,b,i++);   
    }
}
