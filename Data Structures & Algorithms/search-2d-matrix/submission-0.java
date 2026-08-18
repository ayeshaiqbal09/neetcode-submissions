class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int it[]: matrix)
        {
            if(it[0]== target || it[m-1]==target)return true;
            if(it[m-1]<target)continue;
            else if(it[m-1]>target)
            {
                int l=0, r=m-1;
                while(l<=r)
                {
                    int mid=l+(r-l)/2;
                    if(it[mid]==target)return true;
                    else if(it[mid]>target)r=mid-1;
                    else l=mid+1;
                }
            }
        }
        return false;
    }
}
