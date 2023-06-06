/*You are given an integer N you need to print all the Armstrong Numbers between 1 to N. (N inclusive).
If sum of cubes of each digit of the number is equal to the number itself, 
then the number is called an Armstrong number.

For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).
Note: All the test cases in this problem are limited to 3 digit numbers. */
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        System.out.print("Enter any integer: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp = N;
        int sum=0;
        int digit;
        for (int i = 1; i <= 3 ; i++) {
            digit = temp % 10;
            sum += digit * digit * digit ;
            // System.out.print(sum+"\n");
            temp = temp / 10;
        }
        if(N == sum)
        System.out.print(sum + " is an Armstrong Number");
        else  System.out.print(sum + " is not an Armstrong Number");
        sc.close();
    }  
}
