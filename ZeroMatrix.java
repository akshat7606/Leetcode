//
public class ZeroMatrix {
    public static void convertittozero(int[][] matrix,int row, int col){
        
    }
    public void solution(int[][] matrix){
        if(matrix.length==0){
            System.out.println("Matrix is empty");
        }
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(matrix[i][j]=='0'){
                    convertittozero(matrix,i,j);
                }
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
