class Solution {
    public int minSteps(String s, String t) {
        int[] minS=new int[26];
        int[] minT=new int[26];
        int ans=0;
        for(char ch:s.toCharArray()) minS[ch-'a']++;
        for(char ch:t.toCharArray()) minT[ch-'a']++;
        for(int i=0;i<26;i++)
            ans+=Math.abs(minS[i]-minT[i]);
        return ans;
    }
}