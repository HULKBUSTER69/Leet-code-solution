class Solution {
    public boolean validMountainArray(int[] arr) {
         int count1=0,count2=0; int lastvalue=0;
        if(arr.length >= 3)
        {
            for(int i=0;i<arr.length-1;i++)
            {
                if(arr[i] < arr[i+1]) {
                    count1++;  lastvalue =i+1;}
                else break;
            }
            for(int i=lastvalue;i<arr.length-1;i++)
            {
                 if(arr[i] > arr[i+1]) count2++;
                else break;
            }
             if(count1 ==0 || count2==0) return false;
            if((count1+count2) == arr.length-1) return true;
        }

        return false;
    }
}