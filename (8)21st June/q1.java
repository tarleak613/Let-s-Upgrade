/* 509. Fibonacci Number */

public class q1 {
    public int fib(int n) {
        //base case
        if(n == 0) return 0;
        //if the number is 1 or 2 the output should be 1
        if(n == 1 || n == 2)    return 1; 
        //recursive call
        return fib(n-1) + fib(n-2);
        // return smallAns;
    }
}
