class Solution {

    public int lengthOfLongestSubstring(String s) {
		int max = 0;
		Map<Character, Integer> seen = new HashMap<>();
		for(int left = 0, right = 0; right < s.length(); right++){
			char curChar = s.charAt(right);
			if(seen.containsKey(curChar) && seen.get(curChar) >= left){
				left = seen.get(curChar) + 1;
			}

			max = Math.max(max, right - left + 1);
			seen.put(curChar, right);

            
		}
        return max;
    }

}