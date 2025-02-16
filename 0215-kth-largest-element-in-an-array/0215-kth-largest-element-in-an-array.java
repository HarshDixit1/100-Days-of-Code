class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums){
            pq.add(i);
        }
        int q=1;
        while(q!=k){
            pq.poll();
            q++;
        }
        return pq.poll();
    }
}