class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        total = arr[arr.length - 1];
        int end = 2, start = 0;
        while (end < arr.length) {
            total = total + Sum(start, end, arr);
            end = end + 2;
        }

        return total;
    }

    public int Sum(int start, int end, int[] arr) {
        int totalsum = 0;
        if (start == 0) {
            while (end < arr.length) {
                totalsum = totalsum + (arr[end]);
                end++;
                start++;
                if (start != 0) {
                    while (end < arr.length) {
                        totalsum = totalsum + (arr[end] - arr[start - 1]);
                        end++;
                        start++;
                    }
                    return totalsum;
                }
            }
            return totalsum;

        } else {
            while (end < arr.length) {
                totalsum = totalsum + (arr[end] - arr[start - 1]);
                end++;
                start++;
            }
            return totalsum;
        }
    }
}