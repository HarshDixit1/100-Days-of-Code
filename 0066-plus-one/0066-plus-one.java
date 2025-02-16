class Solution {
    public int[] plusOne(int[] digits) {
        int[] ans=new int[digits.length+1];
        int n=digits.length;
        ans[0]=0;
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            int p=digits[i]+carry;
            ans[n]=p%10;
            carry=p/10;
            n--;
        }
        
        if(carry>0){
            ans[0]=carry;
            return ans;
        }
        return Arrays.copyOfRange(ans, 1, digits.length+1);
    }
}