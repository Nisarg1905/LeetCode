class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        boolean flag=false;
        int index=0;
       for(int i=0; i<nums.length; i++){
           if(nums[i]==0 && !flag){
               flag=true;
               index=i;
               continue;
           }
           product*=nums[i];
       } 

        int[] result = new int[nums.length];
        if(flag){
            Arrays.fill(result,0);
            result[index] = product;
            return result;
        }
       for(int i=0;i<nums.length; i++){
           result[i] = product/nums[i];
       }

       return result;
    }
}
