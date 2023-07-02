/*
 * You are given an array of integers A of size N.
 * Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.

Problem Constraints

2 <= N <= 1e5-1e9 <= A[i] <= 1e9There is atleast 1 odd and 1 even number in A
 */
public class q3 {
        public static int diffEvenAndOdd(int[] arr){
        int maxEven=0, maxOdd=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0 && arr[i] != 1)  maxEven = arr[i];
            else  maxOdd = arr[i];  
        }
        // System.out.print(maxEven+" "+maxOdd+" ");
        return maxEven-maxOdd;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{0,2,9};
        System.out.print(diffEvenAndOdd(arr));
    }
}
