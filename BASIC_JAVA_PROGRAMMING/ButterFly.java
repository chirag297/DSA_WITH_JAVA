/* Program To Print ButterFly Pattern
Author :- Chirag Solanki */

import java.util.*;

public class ButterFly{
    public static void main(String args[]){
        Scanner sc = new  Scanner(System.in);
        int no;
        System.out.print("Enter Number: ");
        no = sc.nextInt();
        for(int i=1;i<=no;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            for(int j=no;j>i;j--){
                System.out.print("  ");
            }
            for(int j=no;j>i;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            
            System.out.println();
        }


        for(int i=no;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            for(int j=no;j>i;j--){
                System.out.print("  ");
            }
            for(int j=no;j>i;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            
            System.out.println();
        }
    }
}