class Solution {
    public int lengthOfLongestSubstring(String s) {
     ArrayList<Character> l =new ArrayList<>();
     int max=0;
     //Jebz Logic
     for(int i=0;i<s.length();i++)
     {
        int c=0;
        for(int j=i;j<s.length();j++)
         {
            if(l.contains(s.charAt(j)))
            {
             l.clear();
             break;
            }
            else
            {
              l.add(s.charAt(j));
              c++;
            }
            
        }
        if(c>max)
          max=c;
     }
     return max;
    }
}