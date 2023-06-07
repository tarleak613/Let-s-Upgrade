/*
You are given two integers A and B. You have to find the value of A^B.

NOTE: The value of A^B will always be less than or equal to 10^9 */
import java.util.Scanner;
public class q5 {
    
    public static void main(String[] args) {
        System.out.print("Enter any two integers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 1 ;
        int prod=1;
        while(i <= b){
            prod *=a;
            i++;
        }
        System.out.println(prod);
    }
}
