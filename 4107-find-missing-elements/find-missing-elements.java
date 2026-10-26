class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       int min = nums[0];
       int max = nums[0];
       List<Integer> list = new ArrayList<>();
       int arr[] =  new int[101];
       for(int i=0;i<nums.length;i++){
           min = Math.min(min,nums[i]);
           max = Math.max(max,nums[i]);
           arr[nums[i]] = nums[i];
       }

       for(int i=min;i<max;i++){
         if(arr[i] != i) list.add(i);
       }
        
        return list;
    }
}