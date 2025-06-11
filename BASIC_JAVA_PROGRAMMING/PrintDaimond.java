/* Program To Print Diamond Pattern 
Author :- Chirag Solanki */

import java.util.*;

public class PrintDaimond{
    public static void main(String args[]){
        int no;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        no = sc.nextInt();
        for(int i=0;i<no;i++){
            for(int j=no;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        for(int i=no;i>0;i--){
            for(int j=no;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}