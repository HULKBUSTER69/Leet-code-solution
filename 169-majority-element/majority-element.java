class Solution {
    public int majorityElement(int[] nums) 
    {   int max = Integer.MIN_VALUE ;
        int maj=0;
        Map<Integer, Integer> result = new HashMap<>();
        for(int x : nums)
        {
           result.put(x, result.getOrDefault(x ,0) + 1);
        }

        Set<Map.Entry<Integer,Integer>> val = result.entrySet();
        for(Map.Entry<Integer,Integer> a : val)
        {
            if(a.getValue() > max)
            {
                max = a.getValue();
                maj = a.getKey();
            }

        }
        return maj;
    }
}