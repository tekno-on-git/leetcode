class Solution {
    public boolean searchMatrix(int[][] M, int target) {
        if(M.length == 0 || M[0].length == 0)
            return false;
        
        int m = M.length, n = M[0].length;
        int left = 0, right = m * n - 1;
        while(left <= right){
            int mid = (left + right) >> 1;
            int val = M[mid / n][mid % n];

            if(val == target) return true;
            else if(val < target) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
}