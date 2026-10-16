class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int right=0;
        int last = nums.length-1;

        while(right<=last)
        {
            if(nums[right] ==0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;right++;
            }
            else if(nums[right] == 2){
                 int temp = nums[right];
                nums[right] = nums[last];
                nums[last] = temp;
                last--;
            }else right++;
        }
    }
}