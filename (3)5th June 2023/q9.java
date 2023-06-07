/*Write a program to input an integer N from user and print hollow inverted 
right triangle star pattern of N lines using '*'. */

import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        System.out.print("N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //first star row
        for(int star = 1; star <= N ; star++)
                System.out.print("*");
                System.out.println();
        //remaining star row except the last one
        for (int row = 1; row < N-1; row++) {
                System.out.print("*");
            for(int space= 1; space < N-row-1 ; space++)
                System.out.print(" ");
            System.out.print("*");    
            System.out.println();
        }
        //last star
        System.out.print("*");
        sc.close();
    }
}