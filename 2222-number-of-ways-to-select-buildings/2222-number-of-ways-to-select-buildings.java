class Solution {
    public long numberOfWays(String s) {
        long ans=0;
        int len=s.length();
        long totalZeros=0;
        long totalOnes=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
                totalZeros++;
            else totalOnes++;
        }
        long currentZeros=s.charAt(0)=='0'?1:0;
        long currentOnes=s.charAt(0)=='1'?1:0;
        for(int i=1;i<len;i++)
        {
            if(s.charAt(i)=='0')
            {
                ans=ans+(currentOnes*(totalOnes-currentOnes));
                currentZeros++;
            }else{
                ans=ans+(currentZeros*(totalZeros-currentZeros));
                         currentOnes++;
            }
        }
                         return ans;
    }
}