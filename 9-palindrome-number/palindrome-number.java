class Solution {
    public boolean isPalindrome(int x) 
    {
         int sum=0;
         if(x < 0) return false;
         for(int i=x;i>0;i= i/10)
         {
            sum = (i%10) + sum*10;
         }

         if(sum == x) return true;

         return false;
    }
}