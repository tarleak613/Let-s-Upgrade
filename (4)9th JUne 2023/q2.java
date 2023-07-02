/*
 * You are given an integer array A.
 *  You have to find the second largest element/value in the array or report that no such element exists.

Problem Constraints

1 <= |A| <= 105
0 <= A[i] <= 109

 */
public class q2 {
    public static int secondLargest(int[] arr){
        int n = arr.length;
        if(n == 1) return 0;
        int temp1=arr[0],temp2=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > temp1)  temp1=arr[i];
            else    if(temp2 < arr[i]) temp2=arr[i];   
        }
        return temp2;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,10,5,6,8,1};
        System.out.print(secondLargest(arr));
    }
}
