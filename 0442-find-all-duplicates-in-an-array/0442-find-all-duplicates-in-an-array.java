class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int[] arr=new int[max+1];
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]!=0) list.add(nums[i]);
            else arr[nums[i]]++;
        }
        
                return list;

    }
}