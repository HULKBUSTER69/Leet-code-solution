class Solution {
    public int findLucky(int[] arr)
    {   int track=0;
        Map<Integer,Integer> result = new HashMap<>();
        for(int num : arr){
            result.put(num, result.getOrDefault(num,0) +1 );
        }
         int max = -1;
        for(Map.Entry<Integer,Integer> val1 : result.entrySet())
        {
            if(val1.getKey().equals(val1.getValue())) { 
               max = Math.max(max, val1.getKey());
            }
        }
     
        return max;
    }
}