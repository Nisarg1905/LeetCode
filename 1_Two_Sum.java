class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> store = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++) {
            int num = nums[i];
            int diff = target-num;

            if(store.containsKey(diff)) {
                return new int[] {i, store.get(diff)};
            }

            store.put(num, i);
        }

        return new int[] {};
    }
}
