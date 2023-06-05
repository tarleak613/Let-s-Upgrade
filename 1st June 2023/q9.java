/* Write a program to input from user three numbers(A, B & C) representing side lengths of a triangle.
You have to print if the traingle is "equilateral", "scalene" or "isosceles". */

import java.util.*;
public class q9 {
    public static void main(String[] args) {
        System.out.println("Enter any three numbers: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a ==b && b ==c ) 
		{
            System.out.println("Its is an Equilateral Traingle");
		}	
		else if(a == b || b == c || a == c) 
		{
			System.out.println("It is an Isosceles Triangle");
		} 
		else 
		{
			System.out.println("It is a Scalene Triangle");
		}
        System.out.print((a>b && a>c) ? a : (b>a && b>c ? b : c));
        sc.close();
    }
}
