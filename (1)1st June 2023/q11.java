/*You are given a Bank account having N amount and you are asked to perform ADD(credit) or 
SUBTRACT(debit) operation of an amount X.]
After the operation print the amount left in the Bank account. 
If the debit amount is greater than current balance print "Insufficient Funds"(without quotes) 
and the operation is skipped.
 */
import java.util.*;

public class q11 {
    public static void main(String[] args) {
        System.out.print("Enter (N) amount in Bank Account : ");
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        System.out.print("Enter (X) amount from Bank Account : ");
        int X=sc.nextInt();
        System.out.print("To credit amount press 1 \n To debit amount press 2 : ");
        int choice = sc.nextInt();
        if(choice == 1){ 
            N+=X;
            System.out.print("Amount left in the Bank Account: "+N); 
        }
        else if(choice == 2 && N > X){
            N-=X;
            System.out.print("Amount left in the Bank Account: "+N);
            }
        else{  
            System.out.print("Insufficient Funds");
            System.exit(0);
        }
        sc.close();
    }
}
