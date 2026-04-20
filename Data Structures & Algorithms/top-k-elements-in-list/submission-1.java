class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> fi = new HashMap<>();
        for(int n : nums){
            fi.put(n, fi.getOrDefault(n, 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> fi.get(a) - fi.get(b));
        for(int n : fi.keySet()){
            pq.add(n);
            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] ans = new int[k];
        int i = 0;
        while(!pq.isEmpty()){
            ans[i++] = pq.poll();
        }
        return ans;
    }
}
