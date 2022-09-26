class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,0,target,new ArrayList<>(),ans);
        return ans;
    }
    public void helper(int[] arr,int ind,int target,List<Integer> temp,List<List<Integer>> ans)
    {
        if(target<0)
            return;
        else if(target==0)
            ans.add(new ArrayList<>(temp));
        else{
            for(int i=ind;i<arr.length;i++)
            {
                if(i>ind && arr[i]==arr[i-1]) continue;
                temp.add(arr[i]);
                helper(arr,i+1,target-arr[i],temp,ans);
                temp.remove(temp.size()-1);
            }
        }
    }
}