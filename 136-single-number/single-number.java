class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        for(int i=0;i<nums.length;i++){
            int j=0;
           for(;j<nums.length ;j++){
              if(i != j && nums[i] == nums[j]) break;
           }
           if(j == nums.length) return nums[i];
        }
       return 0; 
    }
}