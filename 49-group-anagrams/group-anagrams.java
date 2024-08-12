class Solution{
	public List<List<String>> groupAnagrams(String[] strs){
		Map<String, List<String>> map = new HashMap<>();
		for(String s: strs){
			String encoded = encode(s);
			map.computeIfAbsent(encoded, k -> new ArrayList<>());
			map.get(encoded).add(s);
		}
		return new ArrayList<>(map.values());
	}

	public String encode(String s){
		int[] freq = new int[26];
		for(char c: s.toCharArray()) freq[c - 'a']++;
		return Arrays.toString(freq);
	}
}