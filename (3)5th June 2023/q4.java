/*Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

1
1_
1_3
1_3_
1_3_5 */

import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        System.out.print("N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int row = 0; row <= N; row++) {
            for(int col = 1; col <= row ; col++){
                if(col % 2 != 0)
                System.out.print(col);
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}