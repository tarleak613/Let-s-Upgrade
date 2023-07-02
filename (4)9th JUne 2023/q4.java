/*
 * You are given an integer T denoting the number of test cases. For each test case,
 *  you are given an integer array A.
You have to print the odd and even elements of array A in 2 separate lines.
NOTE: Array elements should have the same relative order as in A.

Problem Constraints

1 <= T <= 10
1 <= |A| <= 105
1 <= A[i] <= 109
 */
public class q4 {
        public static void EvenAndOdd(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0 && arr[i] != 1)   System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0 || arr[i] == 1)   System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2, 3, 5, 7, 9, 11, 12,13, 15, 17, 20};
        EvenAndOdd(arr);
    }
}
