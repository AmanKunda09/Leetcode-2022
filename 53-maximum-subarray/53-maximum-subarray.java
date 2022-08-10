class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0],runningSum=0;
        for (int i=0;i<nums.length;i++)
        {
            runningSum+=nums[i];
            if(maxSum<runningSum)
                maxSum=runningSum;
            if(runningSum<0)
                runningSum=0;
            
        }
        return maxSum;
    }
}