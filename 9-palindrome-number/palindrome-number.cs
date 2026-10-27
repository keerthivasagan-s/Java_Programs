public class Solution {
    public bool IsPalindrome(int x) {
        int value=x;
        int reverse=0;

        if(x<0){

            return false;
        }

        // int value=x;
        // int reverse=0;
    while(x>0){
        int digit=x%10;
        reverse=reverse*10+digit;
        x=x/10;
    }
    return value==reverse;
        
    }
}