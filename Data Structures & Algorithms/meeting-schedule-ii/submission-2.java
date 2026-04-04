/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> inter) {
        if(inter.size()==0)return 0;
        inter.sort((a,b)-> a.start-b.start);
        int len = inter.size();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(inter.get(0).end);
        for(int i = 1 ; i < len ; i++){
            int start = inter.get(i).start;
            if(pq.size()!=0 && pq.peek() <= start){
                pq.poll();
            }
            pq.add(inter.get(i).end);
        }
        return pq.size();
    }
}
