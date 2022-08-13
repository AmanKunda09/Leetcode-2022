class Solution {
    public void rotate(int[][] matrix) {
        int len=matrix.length;
        int[][] newMatrix=new int[len][len];
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                newMatrix[j][len-1-i]=matrix[i][j];
                   
            }
        }
        for(int i=0;i<len;i++)
        {
            matrix[i]=newMatrix[i];
        }
    }
}