/*Problem Description

Print a pattern consisting of N rows, where each row contains an asterisk (*)
 at the beginning and end of the line, 
 with N-2 spaces in between.
 The Pattern should look like:*<N-2 Spaces>*
 Print the above pattern for a total of N Rows.Refer Example ouput, for better clarification. */

 import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        System.out.print("N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int row = 1; row <= N; row++) {
            System.out.print("*");
            for(int col = 1; col <= N-2 ; col++)
                System.out.print("-");
            System.out.print("*");    
            System.out.println();
        }
        sc.close();
    }
}