class Solution {
    public int[] plusOne(int[] digits) {
        int[] array2 = {1};
        int[] answer = new int[digits.length];

        int i = digits.length-1;
        int j = array2.length-1;
        int k = answer.length-1;
        int c = 0;

        while (k>=0){
            int sum = 0;

            if (i>=0){
                sum+=digits[i];
            }

            if (j>=0){
                sum+=array2[j];
            }

            sum+=c;

            c = sum/10;
            sum = sum%10;

            answer[k] = sum;

            i--;
            k--;
            j--;
        }

        int[] answerArray = new int[0];
        if (c>0){
            answerArray = new int[digits.length+1];
            answerArray[0]  = c;
            for (int m=1,n=0;m<=answerArray.length&&n< answer.length;m++){
                answerArray[m] = answer[n]; ;
                n++;
            }

        }
        else {
            answerArray = new int[digits.length];
            for (int m=0,n=0;m<answerArray.length&&n< answer.length;m++){
                answerArray[m] = answer[n]; ;
                n++;
            }
        }
        
        return answerArray;
        
        
    }
}
