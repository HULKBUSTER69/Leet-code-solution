class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int arr[] = new int[2*size];
        for(int i=0;i<nums.length;i++)
        {
           arr[i] = nums[i];
           arr[size] = nums[i];
           size++;
        }
        return arr;
    }
}