class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        int cars[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            cars[i][0]=position[i];
            cars[i][1]=speed[i];

        }
        Arrays.sort(cars,(a,b)-> Integer.compare(b[0], a[0]));
        double prev=(double)(target-cars[0][0])/cars[0][1];
        int fleet=1;
        for(int i=0;i<n;i++)
        {
            double curr=(double)(target-cars[i][0])/cars[i][1];
            if(curr>prev)
            {
                fleet++;
                prev=curr;
            }
        }
        return fleet;
    }
}
