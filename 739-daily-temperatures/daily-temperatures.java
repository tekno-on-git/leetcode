class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Pair<Integer, Integer>> st = new Stack<>();
        for(int i=0; i < temperatures.length; i++){
            int t = temperatures[i];
            while(!st.isEmpty() && st.peek().getValue()  < t){
                Pair<Integer, Integer> pop = st.pop();
                res[pop.getKey()] = i - pop.getKey();
            }
            st.push(new Pair(i,t));
        }
        return res;
    }
}