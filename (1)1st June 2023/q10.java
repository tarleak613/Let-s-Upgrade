//Take an integer A as input. You have to tell whether A is divible by both 5 and 11 or not.
import java.util.*;
public class q10 {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println((a % 5 == 0 && a % 11 == 0) ? a +" is divible by both 5 and 11 or not" : a+" is not divible by both 5 and 11 or not");
        sc.close();
    }
}
