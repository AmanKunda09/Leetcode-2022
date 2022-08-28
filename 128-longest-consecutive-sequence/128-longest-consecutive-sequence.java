class Solution {
    public int longestConsecutive(int[] nums) {
       Set <Integer> mySet=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            mySet.add(nums[i]);
        }
        int longestCount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!mySet.contains(nums[i]-1))
            {
                int currentNum=nums[i];
                int currentStreak=1;
                while(mySet.contains(currentNum+1))
                {
                    currentNum+=1;
                    currentStreak+=1;
                   
                }
                
                longestCount= Math.max(longestCount,currentStreak);
            }
        }
        return longestCount;
    }
}