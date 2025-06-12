/* Program to Print Hollow Recatngle Pattern
Author :- Chirag Solanki */

import java.util.*;

public class HollowRectangle{
    public static void main(String args[]){
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        no=sc.nextInt();
        for(int i=1;i<=no;i++){ // Main(Outer ) Loop

            for(int j=(no+2);j>=1;j--){ // Inner Loop, This Loop Run 2 times More Than Outer Loop

                if(i==1||j==1||i==no||j==(no+2)){ // Logic To Print Hollow Rectangle
                System.out.print(" *");
                }else{
                System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*
Sample Output:-
Enter Number: 4
 * * * * * *
 *         *
 *         *
 * * * * * *
 
 */