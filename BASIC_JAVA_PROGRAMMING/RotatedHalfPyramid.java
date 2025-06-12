/*
Program To Print Inverted & Rotated Half Pyramid Pattern
Author :- Chirag Solanki
*/

import java.util.*;

public class RotatedHalfPyramid{
    public static void main(String args[]){
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        no=sc.nextInt();
        for(int i=1;i<=no;i++){
            for(int j=no;j>=i;j--){
                System.out.print("  ");   
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

/* Sample Output:- 
Enter Number: 5
           *
         * *
       * * *
     * * * *
   * * * * *
*/