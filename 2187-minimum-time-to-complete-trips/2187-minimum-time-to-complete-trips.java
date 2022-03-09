class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low=0; long high=100000000000000L;
        long ans=high;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            if(tripsTaken(time,mid)>=totalTrips){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public long tripsTaken(int[]time, long mid)
    {
        long count=0;
        for(int it:time)
            count+=(mid/it);
        return count;
    }
}