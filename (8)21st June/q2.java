/* Given a number A, we need to find the sum of its digits using recursion.

Problem Constraints:
1 <= A <= 109

Input Format
The first and only argument is an integer A.

Output Format
Return an integer denoting the sum of digits of the number A. */

public class q2 {
    static int temp =0;
    public static int sumOfDigits(int n){
        //base case
        if(n == 0)  return temp;
        //recrusive call
        temp += n%10;
        n = n/10;
        return sumOfDigits(n);
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(109));
    }
}
