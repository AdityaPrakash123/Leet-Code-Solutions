class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }

        double answer = myPow(x,n/2);

        if (n%2==0){
            return n>0?answer*answer:1/(myPow(x,Math.abs(n/2))*myPow(x,Math.abs(n/2)));
        }
        
        return n>0?answer*answer*x:1/(myPow(x,Math.abs(n/2))*myPow(x,Math.abs(n/2))*x);
    }
    
}
