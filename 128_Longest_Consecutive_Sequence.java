class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length==0) return 0;
        Set<Integer> arr = new HashSet<>();
        for(int num: nums){
            arr.add(num);
        }
        int ans=0;
        int right, left;
        for(int num: nums){
            left=num-1;
            right=num+1;
            while(arr.remove(left)) left--;
            while(arr.remove(right)) right++;
            ans=Math.max(ans, right-left-1);
            if(arr.isEmpty()) return ans; 
        }

        return ans;
    }
}
