/*
 You are given an integer T (number of test cases). 
 You are given array A and an integer B for each test case. 
 You have to tell whether B is present in array A or not.

 Problem Constraints

1 <= T <= 10
1 <= A <= 105
1 <= A[i], B <= 109
 */

class q1{
    public static int Test(int T, int[] A,int B){
        for (int i = 0; i < A.length; i++) 
            if(B == A[i]) return 1;
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.print(Test(1,arr,10));
    }
}