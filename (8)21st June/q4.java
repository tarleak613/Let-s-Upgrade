/* Write a recursive function that takes a string, S, as input and prints the characters of S in reverse order.

Problem Constraints :
1 <= |s| <= 1000 */

public class q4 {
    public static void reverse(String str){
        //base case
        if(str.length() == 0)   return;
        //recersive call
        System.out.print(str.charAt(str.length()-1));   
        reverse(str.substring(0,str.length()-1));
    }
    public static void main(String[] args) {
        String str = "Ayush";
        reverse(str);
    }
}
