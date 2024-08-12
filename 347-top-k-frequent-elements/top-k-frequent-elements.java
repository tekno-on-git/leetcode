class Solution{
	public int[] topKFrequent(int[] nums, int k){
		Map<Integer, Integer> freq = new HashMap<>();
		for(int i: nums){
			freq.put(i, freq.getOrDefault(i, 0) + 1);
		}

		Queue<Integer> q = new PriorityQueue<Integer>(
							(a,b) -> freq.get(a) - freq.get(b));

		for(int i: freq.keySet()){
			q.offer(i);
			if(q.size() > k) q.poll();
		}
		int[] res = new int[k];
		for(int i=0; i < k; i++)
			res[i] = q.poll();
		return res;
	}

}