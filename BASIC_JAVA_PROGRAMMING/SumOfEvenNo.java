/* Print Any Word 10 times That given by user using while loop 
Author :- Chirag Solanki */

import java.util.Scanner;

public class SumOfEvenNo{
    public static void main(String[] args){
        int count = 0,n,no=0; // hear count value is 0
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Word :-");
        n = sc.nextInt();
        while(count <= n){ // util count value less than 10 that cycle Runs and Print the value

            if(count % 2 == 0){ // The Logic Of Odd Number is same(count % 2 != 0)
        
            // if you want to Print Even Number From One to Entered Number
            // you can Use this Line  || System.out.print("\t"+count); 
            no+=count;    
            //  in this case count value add in number until Entered number is not Reach

        
        }
        count ++; // count value increase by one 
        }
        System.out.println("\n"+no);

    }
}