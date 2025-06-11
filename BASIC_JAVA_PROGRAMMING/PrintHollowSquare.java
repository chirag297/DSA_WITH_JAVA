/* Program TO Print Hollow Square Pattern 
Author :- Chirag Solanki */ 

import java.util.*;

public class PrintHollowSquare{
    public static void main(String args[]){
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        no = sc.nextInt();
        for(int i=0;i<no;i++){
            for(int j=0;j<no;j++){
                if(i==0 || i==(no-1) || j==0 || j==(no-1)){
                System.out.print(" *");
                }else{
                System.out.print("  ");
                }
            }
            System.out.println();
        
        }
        
    }
}