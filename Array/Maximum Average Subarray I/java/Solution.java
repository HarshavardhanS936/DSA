class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=0;
        for(int i=0;i<k;i++){
            max+=nums[i];
        }
        int sum=max;
        for(int i=k;i<nums.length;i++){
            max=max+nums[i]-nums[i-k];
            sum=Math.max(sum,max);
        }
        return (double)sum/k;
    }
}