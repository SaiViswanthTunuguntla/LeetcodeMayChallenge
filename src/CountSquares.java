public class CountSquares {
    public static int countSquares(int[][] matrix) {
        int ans=0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
               // System.out.printf("%d ",matrix[i][j]);
                if(matrix[i][j]==1)ans+=1;
              ans+=fn(i,j, matrix);
            }


        }
        return ans;
    }
    static int fn(int r, int c, int[][] matrix){
        if(c==matrix[0].length-1 || r==matrix.length-1) return 0;
      return   matrix[r][c]+matrix[r][c+1]+matrix[r+1][c]+matrix[r+1][c+1]==4?1:0;
    }
    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 0, 1 },
                        { 1, 1, 1, 1 },
                        { 1, 1, 1, 0 }};
            //,{ 32, 33, 39, 50 }
        System.out.println(countSquares(mat));
       // System.out.println("kncjwks"+mat.length);
    }
}
