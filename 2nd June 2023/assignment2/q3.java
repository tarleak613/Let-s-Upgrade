/*Write a program to find sum all Natural numbers from 1 to N
 where you have to take N as input from user */
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1 ;
        int sum = 0;
        while(i <= N){
            sum+=i;
            i++;
        }
        System.out.print(sum);
    }
}
