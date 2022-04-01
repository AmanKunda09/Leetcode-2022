class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int first=j+1;
                int last=n-1;
                int rem=target-(nums[i]+nums[j]);
               while (first<last)
               {
                   int twoSum=nums[first]+nums[last];
                   if(twoSum<rem)
                       first++;
                   else if(twoSum>rem)
                       last--;
                   else
                   {
                       List<Integer>list=new ArrayList<>();
                       list.add(nums[i]);
                       list.add(nums[j]);
                       list.add(nums[first]);
                       list.add(nums[last]);
                       ans.add(list);
                       while(first<last && nums[first]==list.get(2))first++;
                       while(first <last &&nums[last]==list.get(3))last--;
                   }
                   
               }
                while(j+1<n &&nums[j+1]==nums[j])j++;
                
            }
            while(i+1<n&&nums[i+1]==nums[i])i++;
        }
        return ans;
    }
}  