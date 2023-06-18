class Solution {
    public boolean canJump(int[] nums) {
         if(nums.length<=1){
             return true;
         }
        int x=nums[0];
        for(int j=0;j<nums.length;j++){
            if(x<=j&& nums[j]==0){
                return false;
            }
             if(j+nums[j]>x){
                 x=j+nums[j];
             }
            if(x>=nums.length-1){
                return true;
            }
            
        }
        return false;
    }
}