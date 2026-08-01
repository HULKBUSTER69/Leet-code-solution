class Solution {
    public boolean isHappy(int n) 
    {   int rem;
       HashSet<Integer> seen = new HashSet<>();
       while(n != 1 && !seen.contains(n))
       {  int sum=0;
           seen.add(n);
           for(int i=n;i>0;i = i/10)
            {  rem = i%10;
             sum = sum + rem*rem;
            }
             n = sum;
       }
       if(n == 1) return true;
       
       return false;
    }
}