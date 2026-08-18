class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int l=1, r=0;
      for(int i=0;i<piles.length;i++)
      {
        r=Math.max(piles[i],r);
      }  
     int out=r;
      while(l<=r)
      {
        int mid=l+(r-l)/2;
        long time=0;
        for(int it: piles)
        {
            time+=Math.ceil((double)it/mid);
        }
        if(time<=h)
        {
            out=mid;
            r=mid-1;
        }
        else
        l=mid+1;
        

      }
      return out;
    }
}
