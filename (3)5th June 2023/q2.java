/*Given two integers N and M as inputs, print a rectangle of N * M stars.

For example if N = 3, M = 4 then pattern will be like:

****
****
**** */

import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        System.out.print("N and M: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for (int row = 0; row < N; row++) {
            for(int col = 0; col < M ; col++)
            System.out.print("* ");
            System.out.println();
        }
        sc.close();
    }
}
