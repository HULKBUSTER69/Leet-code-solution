class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {   int size1 = nums1.length;
        int size2 = nums2.length;
        int arr[] = new int[(size1+size2)];
        int start1=0,start2=0;
        int size = arr.length; int i=0;
         while(start1 < size1 && start2 < size2)
        {
            if(nums1[start1] < nums2[start2])
              {   arr[i] = nums1[start1++];i++;
              }
            else
              { arr[i] = nums2[start2++];i++;
              }
        }

        while(start1 < size1) arr[i++] = nums1[start1++];
        while(start2 < size2) arr[i++] = nums2[start2++];
         int mid = size/2;
         if(size%2 == 0)
         {
            double median = (arr[mid-1] + arr[mid])/2.0;
            return median;
         }
       
        return arr[mid];
    }
}