class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int max=logs[0][1];
        int ans=logs[0][0];
        for(int i=1;i<logs.length;i++)
        {
            int curr=logs[i][1] - logs[i - 1][1]; 
            if(max==curr)
            {
                ans=Math.min(ans,logs[i][0]);
            }
            else if(max<curr)
            {
                max=curr;
                ans=logs[i][0];
            }
            
        }
        return ans;
    }
}