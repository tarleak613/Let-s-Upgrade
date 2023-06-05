/*Write a program to input an integer from user and print 1 if it is odd otherwise print 0. */
import java.util.*;
public class q5 {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n % 2 == 0) System.out.println("1");
        else System.out.println("0");
        sc.close();
    }
}
