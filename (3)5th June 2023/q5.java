/*Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

____*
___**
__***
_****
***** */

import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        System.out.print("N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int row = 1; row <= N; row++) {
            for(int space = 1; space <= (N-row) ; space++)
                System.out.print(" ");
            for(int star = 1; star <= row ; star++)
                System.out.print("*");
            
            System.out.println();
        }
        sc.close();
    }
}