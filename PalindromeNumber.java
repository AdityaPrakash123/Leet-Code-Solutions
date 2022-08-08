class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int reverse = 0;
        
        while(n>0){
            reverse = reverse*10 + n%10;
            n=n/10;
        }
      return x==reverse;
    }
}
