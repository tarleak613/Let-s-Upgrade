/*
Take an integer N, print the corresponding Full Pyramid pattern for N. */

import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        System.out.print("N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        /*    *
             ***
            *****
           *******
          *********       */
        //first part upward stair
        for (int row = 1; row <= N; row++) {
            for(int space= 1; space <= N-row ; space++)
                System.out.print(" ");
            for(int star= 1; star <= row ; star++)
                System.out.print("*");    
        //second part downward stair
            for(int star= 1; star <= row-1 ; star++)
                System.out.print("*");
            for(int space= 1; space <= N-row ; space++)
                System.out.print(" ");
            System.out.println();
        }
             /*
                        *     
                       * *
                      * * *
                     * * * *
                    * * * * *                */
        for (int row = 1; row <= N; row++) {
            for(int space= 1; space <= N-row ; space++)
                System.out.print(" ");
            for(int star= 1; star <= row ; star++)
                System.out.print("* ");    
            System.out.println();
        }
        sc.close();
    }
}