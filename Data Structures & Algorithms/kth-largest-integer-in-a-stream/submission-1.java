class KthLargest {
    int k;
    PriorityQueue<Integer> arr;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        arr=new PriorityQueue<>();
        for(int n:nums)
        {
            arr.offer(n);
            if(arr.size()>k)
                arr.poll();
        }
    }
    
    public int add(int val) {
        arr.offer(val);
        if(arr.size()>k)
                arr.poll();
        return arr.peek();
    }
}
