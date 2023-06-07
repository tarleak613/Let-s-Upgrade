/*Given an integer N, print N stars in a single line.

For example if N = 5 then pattern will be like:

***** */

import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        System.out.print("N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int row = 0; row < N; row++) {
            System.out.print("* ");
        }
        sc.close();
    }
}
