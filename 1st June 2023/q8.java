/* * You are given 3 integer angles(in degrees) A, B and C of a triangle. 
You have to tell whether the triangle is valid or not.
A triangle is valid if sum of its angles equals to 180. */
import java.util.*;
public class q8 {
    public static void main(String[] args) {
        System.out.print("Enter any three integer angles: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(((a+b+c)==180)?"It is a traingle" : "It is not a traingle");
        sc.close();
    }
}
