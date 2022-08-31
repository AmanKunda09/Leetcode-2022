class Solution {
     public int lengthOfLongestSubstring(String s) {
        HashMap <Character,Integer> myMap=new HashMap<>();
         int len=0;
         int l=0;
         int r=0;
         while(r<s.length()){
             if(myMap.containsKey(s.charAt(r)))
             {
                 l=Math.max(myMap.get(s.charAt(r))+1,l);
                 
             }
                 
                 myMap.put(s.charAt(r),r);
                 len=Math.max(len,r-l+1);
                 r++;
             }
             
         
         return len;
    }
}