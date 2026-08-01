class Solution {
    public int addDigits(int num) {
       
        while (num > 9) {
             int sum = 0;
            for (int i = num; i > 0; i = i / 10) {
                sum = sum + i % 10;
            }
            num = sum;
        }
        return num;
    }
}