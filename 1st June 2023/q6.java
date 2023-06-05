/*Write a program to input two numbers(A & B) from user and 
print the minimum element among A & B in each line.
 */
import java.util.*;
public class q6 {
    public static void main(String[] args) {
        System.out.println("Enter any two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(a<b ? a : b);
        sc.close();
    }
}
