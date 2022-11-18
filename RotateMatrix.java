//Approach =  The only thing that is different is to print the elements of the cycle in a clockwise direction i.e. An N x N matrix will have floor(N/2) square cycles. 
//For example, a 3 X 3 matrix will have 1 cycle. The cycle is formed by its 1st row, last column, last row, and 1st column. 
//TC - O(n*n);
//sc - O(1);
public class RotateMatrix {

    public void sol(int[][] matrix){
        //edge case
        if(matrix.length==0 || matrix.length!=matrix[0].length){
            System.out.println("Invalid matrix");
        }
        int n = matrix.length;
        for(int i=0 ; i<n/2 ; i++){
            for(int j=i ; j<n-i-1 ; j++){
                //save the top
                int temp = matrix[i][j];
                //left -> top
                matrix[i][j] = matrix[n-1-j][i];
                //bottom -> left
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                //right -> bottom
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                //top -> right
                matrix[j][n-1-i] = temp;
            }
        }
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        RotateMatrix rm = new RotateMatrix();
        rm.sol(matrix);
    }
}
