class Solution {
    public boolean containsDuplicate(int[] nums)
     {
        HashSet<Integer> seen = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            seen.add(nums[i]);
        }
        if(seen.size() != nums.length) return true;

        return false;
    }
}