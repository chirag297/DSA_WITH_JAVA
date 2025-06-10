/* Program that Convert Binary Number Into Decimal Number
Author :- Chirag Solanki */

import java.util.*;

public class BinaryToDecimal{
    public static void main(String args[]){
        int pow = 0, decimal =0;
        int no,n,lastd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Binary Number: ");
        no = sc.nextInt();
        n=no;
        while(no>0){
            lastd = no % 10;  // To Find Last Digit Of Any Number
            decimal = decimal + (lastd * (int)Math.pow(2,pow)); // Binary To Decimal Logic
            pow++; // Increase Value Of Pow
            no /= 10; // To Make Number Small by Divied Last Digit
        }

        System.out.println("The Decimal Number Of Binary Number("+n+") is: "+decimal); // Print Final Value Of Converted Decimal Number
        
        
    
    }
}