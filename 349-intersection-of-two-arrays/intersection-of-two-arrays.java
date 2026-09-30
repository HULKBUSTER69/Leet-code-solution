class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {   List<Integer> mylist = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i] == nums2[j])
                {
                    if(!mylist.contains(nums1[i]))
                    {
                        mylist.add(nums1[i]);
                    }
                }
            }
        }
        int arr[] = new int[mylist.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = mylist.get(i);
        }
        return arr;
    }
}