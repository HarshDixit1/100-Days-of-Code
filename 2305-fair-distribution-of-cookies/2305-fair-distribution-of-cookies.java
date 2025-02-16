class Solution {
    public int distributeCookies(int[] cookies, int k) {
        int[] count = new int[k];
        
        return distribute(cookies, count, k, 0);
    }
    
    private int distribute(int[] cookies, int[] count, int k, int id) {
        if (id >= cookies.length) {
            int res = Integer.MIN_VALUE;
            for(int num : count) {
                res = Math.max(res, num);
            }
            
            return res;
        }
        
        int ret = Integer.MAX_VALUE;
        for(int i = 0; i < k; i++) {
            count[i] += cookies[id];
            
            ret = Math.min(ret, distribute(cookies, count, k, id + 1));
            
            count[i] -= cookies[id];
        }
        
        return ret;
    }
}
