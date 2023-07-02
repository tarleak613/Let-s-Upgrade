/* You are given a 2D integer matrix A, return a 1D integer array containing row-wise sums of original matrix. */

class q4{
    public static void main(String[] args) {
        int[][] A = new int[][]{{1,2,3,4},
                                {5,6,7,8},
                                {9,2,3,4}};
 
        int[] R = new int[A[0].length];
        for(int i=0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++) {
                R[i] += A[i][j];
            }
        }
        for(int i=0; i < R.length; i++){
                System.out.print(R[i]+" ");
        }
    }
}
