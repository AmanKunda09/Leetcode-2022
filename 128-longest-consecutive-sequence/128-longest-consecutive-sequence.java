class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        int ans=1;
        int currentCon=1;
        for(int i=1;i<nums.length;i++)
        {
            
            if((nums[i]-nums[i-1])==1)
            {
                currentCon+=1;
                ans=Math.max(ans,currentCon);
            } else if(nums[i]!=nums[i-1]){
                currentCon=1;
            }
            
        }
        return ans;
    }
}