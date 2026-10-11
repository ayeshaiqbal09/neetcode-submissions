class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1, r=0;
        for(int p:piles)
        {
          r=Math.max(r, p);
        }
        int res=r;
        while(l<=r)
        {
          int mid=l+(r-l)/2;
          double time=0;
          for(int it:piles)
          {
            time+=Math.ceil((double)it/mid);
          }
          if(time<=h)
          {
            res=mid;
            r=mid-1;
          }
          else
          l=mid+1;
        }
        return res;
    }
}
