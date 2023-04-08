class Solution {
    public int firstUniqChar(String s) {
        int l=s.length();
        int flag=0;
       for(int i=0;i<l;i++)
       {
           flag=0;
           char ch=s.charAt(i);
           for(int j=0;j<l;j++)
           {
               if(i==j)
                continue;
               if(ch==s.charAt(j))
                {
                    flag=1;
                    break;
                }
           }
           if(flag==0)
            return i;
       } 
       return -1;
    }
}