class Solution {
    public int reversePairs(int[] nums) {
     return  mergeSort(nums,0,nums.length-1);
    }
    private int mergeSort(int[] nums,int l,int r)
    {
        if(l>=r) return 0;
        int mid=(l+r)/2;
        int inv=mergeSort(nums,l,mid);
        inv+=mergeSort(nums,mid+1,r);
        inv+=merge(nums,l,mid,r);
        return inv;
    }
    private int merge(int[] nums,int l,int mid,int r)
    {
        int count=0;;
        int j=mid+1;
        for(int i=l;i<=mid;i++)
        {
            while(j<=r && nums[i] > (2 * (long) nums[j]))
            {
                j++;
            }
            count+=(j-(mid+1));
        }
        ArrayList<Integer> temp=new ArrayList<>();
        int i=l;
        j=mid+1;
        while(i<=mid && j<=r)
        {
            if(nums[i]<nums[j])
            {
                temp.add(nums[i]);
                i++;
            }else{
                temp.add(nums[j++]);
            }
        }
        while(i<=mid){
            temp.add(nums[i++]);
        }
        while(j<=r)
        {
            temp.add(nums[j++]);
        }
        for(i=l;i<=r;i++)
        {
            nums[i]=temp.get(i-l);
        }
        return count;
        
    }
}