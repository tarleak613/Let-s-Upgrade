/* You are given a 2D integer matrix A, return a 1D integer array
 containing column-wise sums of original matrix. */

 class q3{
    public static void main(String[] args) {
        int[][] A = new int[][]{{1,2,3,4},
                                {5,6,7,8},
                                {9,2,3,4}};
 
        int[] R = new int[A[0].length];
        for(int i=0; i < A[0].length; i++){
            for (int j = 0; j < A.length; j++) {
                R[i] += A[j][i];
            }
        }
        for(int i=0; i < R.length; i++){
                System.out.print(R[i]+" ");
        }
    }
}