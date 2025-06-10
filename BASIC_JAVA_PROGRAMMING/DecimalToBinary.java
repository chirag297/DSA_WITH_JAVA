/* Program that Convert   Decimal Number Into Binary Number
Author :- Chirag Solanki */
import java.util.*;

public class DecimalToBinary{
    public static void main(String args[]){
        int binary=0, rem=0,pow=0;
        int no;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Decimal Number: ");
        no=sc.nextInt();
        
        while(no >0){
        rem = no % 2;
        binary = binary + rem * (int)Math.pow(10,pow);
        pow++;
        no /= 2;
        }
        System.out.print(binary);
        
    }

}