/* You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M).
 You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).

If A and B are two matrices of the same order (same dimensions). 
Then A - B is a matrix of the same order as A and B and its 
elements are obtained by doing an element wise subtraction of A from B */
class q2{
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
                C[i][j] = A[i][j] - B[i][j];
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
