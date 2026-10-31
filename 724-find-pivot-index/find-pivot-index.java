class Solution {
    public int pivotIndex(int[] nums) {
        int[] Psum = new int[nums.length];
        int[] Ssum = new int[nums.length];

        // Prefix sum...
        Psum[0] = nums[0];
        for(int i=1;i<nums.length;i++){
             Psum[i] = nums[i] + Psum[i-1]; 
        }

        //Suffix sum...
        Ssum[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
             Ssum[i] = nums[i] + Ssum[i+1];
        }
        //Sum...
        for(int i=0;i<nums.length;i++){
           if(Psum[i] == Ssum[i]) return i;
        }
        return -1;
    }
}