class Solution {
     public int convertTime(String from, String to){
        int diff = min(to) - min(from), ops[] = {60, 15, 5, 1}, r = 0;
        for(int i = 0; i < ops.length && diff > 0; diff = diff % ops[i++])
            r += diff / ops[i];
        return r;
    }

    int min(String time){
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }
}