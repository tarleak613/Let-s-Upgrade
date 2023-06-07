/*You are given an integer A as input and you need to determine whether it is a palindrome or not.
A palindrome integer is one whose digits, when reversed, result in the same number.
For example, 121 is a palindrome because its reverse is also 121, 
but 123 is not a palindrome because its reverse is 321.
Note: The given integer will not have any leading zeros. */

import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        System.out.print("Enter any integer: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp = N;
        int rev=0,digit;
        for (int i = 1; i <= 3 ; i++) {
            digit = temp % 10;
            rev =rev*10 + digit;
            temp = temp / 10;
        }
        if(N == rev)
        System.out.print(N + " is a palindrome Number");
        else  System.out.print(N + " is not a palindrome Number");
        sc.close();
    }
}
