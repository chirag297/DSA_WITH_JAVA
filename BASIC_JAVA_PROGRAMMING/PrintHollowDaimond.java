/* Program To Print Diamond Pattern 
Author :- Chirag Solanki */

import java.util.*;

public class PrintHollowDaimond{
    public static void main(String args[]){
        int no;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        no = sc.nextInt();
        for(int i=1;i<=no;i++){
            for(int j=no;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j == 1 || (2*i-i)==j){
                System.out.print(" *");
                }else{
                System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i=no;i>0;i--){
            for(int j=no;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==(2*i-i)){
                System.out.print(" *");
                }else{
                System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}