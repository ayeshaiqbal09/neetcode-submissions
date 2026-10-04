class Pair{
    double val;
    int arr[]=new int[2];
    public Pair(double val, int arr[])
    {
        this.val=val;
        this.arr=arr;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(a.val, b.val));
        for(int poi[]: points)
        {
            double sum = 1.0 * poi[0] * poi[0] + 1.0 * poi[1] * poi[1];
            pq.offer(new Pair(sum, new int[]{poi[0], poi[1]}));
        }
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().arr;
        }

        return result;
    }
}
