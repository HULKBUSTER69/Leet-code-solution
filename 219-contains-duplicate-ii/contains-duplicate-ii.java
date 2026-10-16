class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer,Integer> result = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
           if(result.containsKey(nums[i])){
               if(i - result.get(nums[i]) <=k) return true;
               else{
                 result.put(nums[i], i);
               }
           }
           else {
             result.put(nums[i], i);
           }

        }
        return false;
    }
}