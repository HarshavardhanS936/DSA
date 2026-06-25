1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int max=0;
4        for(int i=0;i<k;i++){
5            max+=nums[i];
6        }
7        int sum=max;
8        for(int i=k;i<nums.length;i++){
9            max=max+nums[i]-nums[i-k];
10            sum=Math.max(sum,max);
11        }
12        return (double)sum/k;
13    }
14}