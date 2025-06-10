/* Program To Print Pyramid pattern Using Numbers.
Author:- Chirag Solanki */


import java.util.*;

public class PyramidPattern{
    public static void main(String args[]){
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        no = sc.nextInt();
        for(int i=1;i<=no;i++){ // Outer (Main) Loop

            for(int j=no;j>i;j--){// First Inner Loop For Print Space
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){ // Second Inner Loop For Print Pyramid
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}