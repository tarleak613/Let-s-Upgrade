/* Take an integer A as input. 
You have to print the sum of all odd numbers in the range [1, A]. */


import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int i = 1 ;
        int sum=0;
        while(i <= A){
            if(i % 2 != 0) sum +=i;
            i++;
        }
        System.out.print(sum);
    }
}
