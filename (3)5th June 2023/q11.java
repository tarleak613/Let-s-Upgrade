/*Take an integer N as input, print the corresponding Half Diamond pattern with 2*N - 1 rows.

For example if N = 5 then pattern will be like:

*
**
***
****
*****
****
***
**
*                 */

import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        System.out.print("N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //first part upward stair
        for (int row = 1; row <= (N*2)-1; row++) {
            for(int col= 1; col <= row && row<=N ; col++)
                System.out.print("*");
        
        //lower part
            for(int col= 1; col <= (2*N)-row && row>N; col++)
                System.out.print("*");    
            System.out.println();
        }
        sc.close();
    }
}    