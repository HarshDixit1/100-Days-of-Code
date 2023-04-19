class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());
        // We will use the array to mark which elements are present in nums1 and then we will iterate through nums2 and do certain operations accordingly
        int[] hm = new int[2001];

        // Mark those elements which are present in nums1
        // to accomodate the negative elements , 1000 is added to each element
        // Hence the range of elements changes from [-1000 , 1000] to [0 , 2000]
        for(int ele : nums1) hm[ele + 1000] = 1;
        for(int ele : nums2){
            // If that element is present in both nums1 and nums2 then it is of no use to us and so we mark it as -1
            if(hm[ele + 1000] == 1) hm[ele + 1000] = -1;
            //If that element is not present in nums1 but present in nums2 then add it to answer[1] and mark it as -1 so that we don't end up adding duplicates of that number present in nums2
            else if(hm[ele + 1000] == 0){
                answer.get(1).add(ele);
                hm[ele + 1000] = -1;
            }
        }
        for(int i = 0 ; i <= 2000 ; i++){
            // Elements which remain marked as 1 are those elements which were present in nums1 but were never encountered in nums2 , so simply add them in answer[0]
            if(hm[i] == 1) answer.get(0).add(i - 1000);
        }

        return answer;
        // Dry-run once on pen and paper and everything will be clear (If it is not till this point)
    }
}