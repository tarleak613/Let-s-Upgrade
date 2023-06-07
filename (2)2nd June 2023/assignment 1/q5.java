/*Implement a program that takes two positive integers A and B in the input and prints their LCM.

Definition of LCM : The Least Common Multiple or LCM of two numbers say A and B, 
is denoted as LCM (A,B). And the LCM is the smallest or least positive 
integer that is divisible by both A and B. */
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        System.out.print("Enter any two integers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm=1;
        for (int i = 1; i <= a && i<= b; i++) {
            if(a % i == 0 && b % i == 0) lcm=i;
        }
        lcm = (a * b)/lcm;
        System.out.print("LCM of " + a + " & " + b + " is " +lcm); 
        sc.close();
    }
}
