/*Take an integer N as input, print the corresponding stair pattern for N.

For example if N = 4 then stair pattern will be like:

*
**
***
****               */

import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        System.out.print("N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int row = 0; row < N; row++) {
            for(int star = 0; star <= row ; star++)
            System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}
