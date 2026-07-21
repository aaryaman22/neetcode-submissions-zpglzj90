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

        inter.sort((a,b) -> a.start - b.start);

        PriorityQueue<Interval> pq = new PriorityQueue<>((a,b) -> a.end - b.end);
        int count = 0;

        for(Interval i : inter){
            if(!pq.isEmpty() && pq.peek().end <= i.start){
                pq.poll();
            }
            pq.offer(i);
            count = Math.max(count, pq.size());
        }
        return count;
    }
}
