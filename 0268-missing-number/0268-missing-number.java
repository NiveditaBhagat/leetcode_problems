class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],nums[i]);
        }
        for(int i=0;i<=nums.length;i++){
            if(!map.containsKey(i)){
               ans= i;
        
            }
        }
        return ans;
    }
}