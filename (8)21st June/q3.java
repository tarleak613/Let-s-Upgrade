/* Write a program to find the factorial of the given number A using recursion.

Note: The factorial of a number N is defined as the product of the numbers from 1 to N.

Problem Constraints:
0 <= A <= 12             */

public class q3 {
    static int fact = 1;
    public static int factorial(int n){
        //base case
        if(n == 0)  return 0;
        if(n == 1)  return fact;
        fact *= n;
        return factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
