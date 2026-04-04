class Solution {

    private int bs(int[][]inter, int t){
        int l = 0, r = inter.length -1;
        while(l <= r){
            int m = (l+r)/2;
            if(inter[m][0] < t){
                l = m+1;
            }else{
                r = m-1;
            }
        }
        return l;
    }

    private int[][] addInterval(int[][] inter, int[] ni, int ind){
        List<int[]> list = new ArrayList<>();

        for(int[] interval : inter){
            list.add(interval);
        }

        list.add(ind, ni);

        return list.toArray(new int[0][]);
    }
    private int[][] mergeInterval(int[][] inter){
        List<int[]> li = new ArrayList<>();
        int rb = inter[0][1], lb = inter[0][0];
        for(int i = 1 ; i < inter.length ; i++){
            if(rb >= inter[i][0]){
                rb = Math.max(rb, inter[i][1]);
            }else{
                li.add(new int[]{lb, rb});
                lb = inter[i][0];
                rb = inter[i][1];
            }
        }
         li.add(new int[]{lb, rb});
         return li.toArray(new int[0][]);
    }

    public int[][] insert(int[][] inter, int[] ni) {
        int index = bs(inter, ni[0]);
        inter = addInterval(inter, ni, index);
        inter = mergeInterval(inter);
        return inter;
    }
}
