/* Write a program to input three numbers(A, B & C) 
from user and print the maximum element among A, B & C in each line. */


import java.util.*;
class q4 {
    public static void main(String[] args) {
        System.out.println("Enter any three numbers: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.print((a>b && a>c) ? a : (b>a && b>c ? b : c));
        sc.close();
    }
}