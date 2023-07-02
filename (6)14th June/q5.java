/* Problem Description

You are given a N X Ninteger matrix. You have to find the sum of all the main diagonal elements of A.

Main diagonal of a matrix Ais a collection of elements A[i, j]such that i = j.
 */
public class q5{
    public static void main(String[] args) {
        int[][] A = new int[][]{{1, -2, -3},
                                {-4, 5, -6},
                                {-7, -8, 9}};  
        int sumOfDiagonals = 0;
        for(int i=0; i < A.length; i++){
            // for (int j = 0; j < A[0].length; j++) {
               sumOfDiagonals += A[i][i];
            // }
        }
            System.out.println(sumOfDiagonals);
    }
}

