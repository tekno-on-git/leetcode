class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i= 0, j = numbers.length - 1;
        while(i <= j){
            int sum = numbers[i] + numbers[j] - target;
            if(sum == 0)
                return new int[]{ i + 1, j + 1};
            else if( sum < 0)
                i++;
            else
                j--;
        }
        return new int[]{ -1, -1};
    }
}