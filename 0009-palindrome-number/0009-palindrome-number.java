class Solution {
    public boolean isPalindrome(int x) {
        int rev =0;
        int original = x;
        while(x !=0){
            int num = x % 10;
            rev = rev *10 + num;
            x = x/10;

        }

        if(original >= 0 && original == rev){
            return true;
        }

        return false;
    }
}