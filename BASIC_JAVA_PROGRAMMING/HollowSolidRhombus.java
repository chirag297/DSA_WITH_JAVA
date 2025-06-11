/* program to Print Hollow Solid Rombus pattern 
Author:- Chirag Solanki */

import java.util.*;

public class HollowSolidRhombus{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.print("Enter Number: ");
        no=sc.nextInt();
        for(int i=1;i<=no;i++){
            for(int j=no;j>0;j--){
                System.out.print("  ");
            }
            for(int j=no;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=no;j++){
                if(i==1||i==no||j==1||j==no){
                System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}