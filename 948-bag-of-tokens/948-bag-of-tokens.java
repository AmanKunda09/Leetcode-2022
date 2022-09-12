class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length==0) return 0;
        
        int score=0;
        int curr=0;
        int n=tokens.length;
        int left=0,right=n-1;
        Arrays.sort(tokens);
        while(left<=right)
        {
            
            if(power>=tokens[left]){
                curr++;
                power-=tokens[left];
                left++;
                score=Math.max(score,curr);
            }
            else if(curr>0){
                curr--;
                power+=tokens[right];
                right--;
            }else{
                break;
            }
            
        }
        return score;
    }
}