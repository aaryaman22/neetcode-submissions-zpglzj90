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
    public boolean canAttendMeetings(List<Interval> inter) {
        int len = inter.size();
        if(len==0)return Boolean.TRUE;
         inter.sort((a, b) -> a.start - b.start);
        int lr = inter.get(0).end;
        for(int i = 1 ; i < len ; i++){
            if(inter.get(i).start < lr){
                return Boolean.FALSE;
            }
            lr = inter.get(i).end;
        }
        return Boolean.TRUE;
    }
}
