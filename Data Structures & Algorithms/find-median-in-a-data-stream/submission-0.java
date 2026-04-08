class MedianFinder {

    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;

    public MedianFinder() {
        min = new PriorityQueue<>();
        max = new PriorityQueue<>((a,b) -> b-a);
    }
    
    public void addNum(int num) {
        max.offer(num);
        min.offer(max.poll());

        if(max.size() < min.size()){
            max.offer(min.poll());
        }
    }
    
    public double findMedian() {
        if(min.size()==max.size()){
            return (min.peek() + max.peek())/2.0;
        }
        return max.peek();
    }
}
