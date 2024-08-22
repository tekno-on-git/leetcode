class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int n = temps.length;
        int[] res = new int[n];
        int maxTemp = 0;

        for(int i=n-1; i >= 0; i--){
            if(temps[i] >= maxTemp){
                maxTemp = temps[i];
                continue;
            }

            int days = 1;
            while(temps[i + days] <= temps[i])
                days += res[i + days];

            res[i] = days;
        }
        return res;
    }
}