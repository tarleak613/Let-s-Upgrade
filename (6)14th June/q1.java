/* You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B
.Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal */

class q1{
    public static void main(String[] args) {
        int[][] A = new int[][]{{1, 2, 3}, 
                                {4, 5, 6}, 
                                {7, 8, 9}};
        int[][] B = new int[][]{{9, 8, 7}, 
                                {6, 5, 4}, 
                                {3, 2, 1}};  
        int[][] C = new int[A.length][A[0].length];
        for(int i=0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for(int i=0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
