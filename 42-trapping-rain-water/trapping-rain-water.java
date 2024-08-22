class Solution {
    public int trap(int[] height) {
        int water = 0;
        int maxLeft = Integer.MIN_VALUE, maxRight = Integer.MIN_VALUE;
        int left  =0, right = height.length - 1;

        while(left < right){
            maxLeft = Math.max(maxLeft, height[left]);
            maxRight = Math.max(maxRight, height[right]);

            if(maxRight > maxLeft){
                water += maxLeft - height[left];
                left++;
            } else {
                water += maxRight - height[right];
                right--;
            }
        }
        return water;
    }
}