/* Take an integer A as input, you have to tell whether it is a prime number or not.

A prime number is a natural number greater than 1 which is divisible only by 1 and itself.
 */
import java.util.Scanner;
class q1{
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) count++;
        }
        if(count == 2) System.out.print(n + " is a prime number."); 
        else System.out.println(n + " is not a prime number.");
        sc.close();

    }
}
