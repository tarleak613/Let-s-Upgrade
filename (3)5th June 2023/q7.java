/*Take an integer N as input, print the corresponding pattern for N.
For example if N = 4 then pattern will be like:
1
1 2
1 2 3
1 2 3 4
NOTE: There should be no extra spaces after last integer. */

import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        System.out.print("N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int row = 1; row <= N; row++) {
            for(int col = 1; col <= row ; col++)
                System.out.print(col);
            System.out.println();
        }
        sc.close();
    }
}
