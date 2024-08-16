class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = cleanString(s);
        int i = 0, j = arr.length - 1;
        while(i <= j){
            if(arr[i] != arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    public char[] cleanString(String s){
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c >= 'a' &&  c <= 'z'  || c >= '0' && c <= '9') 
                sb.append(c);
        }
        return sb.toString().toCharArray();
    }
}