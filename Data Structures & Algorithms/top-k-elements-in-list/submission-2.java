class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> fiMap = new HashMap<>();
        for(int n : nums) fiMap.put(n, fiMap.getOrDefault(n, 0) + 1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> fiMap.get(a)-fiMap.get(b));
        for(int n : fiMap.keySet()){
            pq.offer(n);
            if(pq.size() > k)pq.poll();
        }
        int [] ans = new int[k];
        for(int i = 0 ; i < k ; i++){
            ans[i] = pq.poll();
        }
        return ans;
    }
}
