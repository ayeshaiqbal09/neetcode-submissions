class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        reverse(matrix);

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<m;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public void reverse(int mat[][])
    {
        int n=mat.length;
        for(int i=0;i<n/2;i++)
        {
            int temp[]=mat[i];
            mat[i]=mat[n-1-i];
            mat[n-1-i]=temp;
            
        }
    }
}
