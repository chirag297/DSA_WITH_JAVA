/* Program To print Palindromic Pattern. print Pattern Using Numbers.
Author:- Chirag Solanki */

import java.util.*;

public class PrintPalindrom{
    public static void main(String args[]){
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        no = sc.nextInt();
        for(int i=1;i<=no;i++){ // Main Loop
            for(int j=no;j>i;j--){// First Inner Loop For Print Space
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){ // Second Inner Loop For Print Left Side Of Palindromic Pattern
                System.out.print(k);
            }
            for(int n=2;n<=i;n++){ // Third Inner Loop For Print Right Side Of Palindromic Pattern
                System.out.print(n);
            }
            System.out.println();
        }
    }
}