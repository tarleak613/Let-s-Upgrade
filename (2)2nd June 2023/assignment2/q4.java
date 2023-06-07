/*/*Write a program to print the multiplication table of the number entered by the user, N.

The table for input N = 5 should get displayed in the following form:

5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50 */ 
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1 ;
        while(i <= 10){
            System.out.println(N + " * " + i + " = " + (N*i));
            i++;
        }
    }
}
