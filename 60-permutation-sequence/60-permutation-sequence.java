class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        List<Integer> temp=new ArrayList<>();
        for(int i=1;i<n;i++)
        {
            fact*=i;
            temp.add(i);
        }
        temp.add(n);
        String ans="";
        k=k-1;
        while(true)
        {
            ans+=temp.get(k/fact);
            temp.remove(k/fact);
            if(temp.size()==0)
                break;
            k=k%fact;
            fact=fact/temp.size();
        }
        return ans;
    }
}