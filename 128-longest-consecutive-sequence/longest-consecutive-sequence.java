class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int curLen = 1, maxLen = 0;
        for(int i =1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]) continue;
            if(nums[i] == nums[i - 1] + 1){
                curLen++;
            } else {
                maxLen = Math.max(curLen, maxLen);
                curLen = 1;
            }
        }
        maxLen = Math.max(curLen, maxLen);
        return maxLen;

    }
}