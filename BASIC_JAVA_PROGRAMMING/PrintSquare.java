/* Program TO Print Square Pattern 
Author :- Chirag Solanki */ 

import java.util.*;

public class PrintSquare{
    public static void main(String args[]){
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        no = sc.nextInt();
        for(int i=0;i<no;i++){
            for(int j=0;j<no;j++){
                System.out.print(" *");
            }
            System.out.println();
        
        }
        
    }
}


/*
import java.util.*;

public class PrintSquare{
    public static void main(String args[]){
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        no = sc.nextInt();
        for(int i=0;i<no;i++){
            for(int j=0;j<no;j++){

            }
        }
        System.out.println();
    }
}
*/
