class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return nums[0];
        int left=0;
        int right=0;
        while(right<nums.length)
        {
            if(nums[left]==nums[right])
            {
                right++;
            }else{
                nums[++left]=nums[right++];
            }
        }
        return ++left;
        
    }
}