//approach - just traverse over the matrix and check for the zero if you found that zero just make left and top 0 and traverse once from bottom to make right and bottom as 0;
//TC - O(n*n);
//SC - O(1);
public class ZeroMatrix {
    public void solution(int[][] matrix){
        if(matrix.length==0){
            System.out.println("Matrix is empty");
        }
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0; j<matrix[0].length ; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=matrix.length-1 ; i>=0 ; i--){
            for(int j=matrix[0].length-1 ; j>=0 ; j--){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                System.out.println(matrix[i][j]);
            }
        }

    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,0},
            {6,7,8}
        };

        ZeroMatrix zm = new ZeroMatrix();
        zm.solution(matrix);
    }
}
