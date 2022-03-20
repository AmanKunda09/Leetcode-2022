class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> myMap=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int num:nums)
        {
            if(!myMap.containsKey(num))
                myMap.put(num,1);
            else
                myMap.put(num,myMap.get(num)+1);
                
        }
        for (int x: myMap.keySet()) {
      if (myMap.get(x) > (nums.length / 3))
        ans.add(x);
    }
        return ans;
}
}