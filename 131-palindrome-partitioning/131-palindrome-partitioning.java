class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        helper(s,0,new ArrayList<>(),ans);
        return ans;
    }
    private void helper(String s,int ind,List<String> temp,List<List<String>> ans)
    {
        if(ind==s.length())
        {
            ans.add(new ArrayList(temp));
            return;
        }
        else{
            for(int i=ind;i<s.length();i++)
            {
                if(isPalindrome(s,ind,i))
                {
                    temp.add(s.substring(ind,i+1));
                    helper(s,i+1,temp,ans);
                    temp.remove(temp.size()-1);
                }
            }
        }
    }
    private boolean isPalindrome(String s,int start,int end)
    {
        while(start<end)
        {
            if(s.charAt(start++)!=s.charAt(end--))
                return false;
        }
        return true;
    }
}