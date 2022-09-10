class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max=0;
        int current=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                current++;
            }else{
                current=0;
            }
            max=Math.max(current,max);
        }
        return max;
    }
}