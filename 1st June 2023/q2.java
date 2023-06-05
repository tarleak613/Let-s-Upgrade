// You are given an integer A.

// You have to tell how many days are there in the month denoted by Ain a non-leap year
import java.util.Scanner;
import java.lang.*;
class q2 {
    public static void main(String[] args) {
        System.out.println("Enter the month number: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n < 1 || n > 12) {
            System.out.print("Wrong Input!");
            System.exit(0);
        }
        if(n == 1) System.out.println("31");
        else if(n == 2) System.out.println("28");
        else if(n == 3) System.out.println("31");
        else if(n == 4) System.out.println("30");
        else if(n == 5) System.out.println("31");
        else if(n == 6) System.out.println("30");
        else if(n == 7) System.out.println("31");
        else if(n == 8) System.out.println("31");
        else if(n == 9) System.out.println("30");
        else if(n == 10) System.out.println("31");
        else if(n == 11) System.out.println("30");
        else System.out.println("31");
        sc.close();
    }
}