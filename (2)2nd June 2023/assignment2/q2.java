/*Write a program to print all odd numbers from 1 to N 
where you have to take N as input from user. Here N is inclusive. */
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1 ;
        while(i <= N){
            if(i % 2 != 0)
            System.out.print(i+" ");
            i++;
        }
    }
}
