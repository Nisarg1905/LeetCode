class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet=new HashSet<Integer>();
        for(int num: nums){
            if(!numSet.add(num)){
                return true;
            }
        }
        return false;
    }
}
