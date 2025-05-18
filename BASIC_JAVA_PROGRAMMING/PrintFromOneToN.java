/* Print Number from one to n times using while loop 
Author :- Chirag Solanki */

import java.util.Scanner;

public class PrintFromOneToN{
    public static void main(String[] args){
        int count = 0, n,no=0; // hear count value is 0
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number :- ");
        n = sc.nextInt();
        while(count <= n){ // util count value less than Entered number that loop runninng
            
            no+=count; // it is no = no + count;,
            //  in this case count value add in number until Entered number is not Reach

            count ++; // count value increase by one 
        }
        // when Entered number is same as count value the while loop is stop.
        System.out.println("The Sum of One to Entered Number is :- "+no); //print the final value of number.
    }
}